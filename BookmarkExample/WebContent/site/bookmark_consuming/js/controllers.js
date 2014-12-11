var bookmarkControllers = angular.module('bookmarkControllers',[])

bookmarkControllers.controller('bookmarkDtlCtrl',['$scope','BookMark',
    function($scope,BookMark) {
	BookMark.get(function(response){
    	  $scope.bookmark = response;
    	  
      });
	}]);

bookmarkControllers.controller('changeBookmark',['$scope', 'BookMark',function($scope,BookMark){
	$scope.customBookmark = 'arnaldo/bookmarks/0';
	$scope.tmpBookmark = "arnaldo/bookmarks/0";
	var values = [];
	values = $scope.customBookmark.split("/bookmarks/");
	$scope.newBookmark = function(tmpBookmark){
		if(tmpBookmark)
		{
		values = tmpBookmark.split("/bookmarks/");
		
		}
		BookMark.get({userName:values[0],booknumber:values[1]},function(response){
			
			$scope.bookmark = response.bookmark;
			$scope.links = response.links;
			
		});

		//BookMark.update({userName : $scope.userName , booknumber : $scope.booknumber});
	};
	
}]);

bookmarkControllers.controller('postBookmark',['$scope','BookMark',function($scope,BookMark){
	$scope.userName='giuseppe';
	$scope.booknumber='9';
	$scope.bookdesc = 'capitolo N'
	$scope.bookuri = "http://empty"
	$scope.postMyBookmark = function( userN, bookN, desc, uri)
	{
		if( userN )
		{
			$scope.userName = userN;
			$scope.booknumber = bookN;
			$scope.bookdesc = desc;
			$scope.bookuri = uri
		}
		$userName = $scope.userName;
		$booknumber = $scope.booknumber;
		var myBookmark= new BookMark();
		myBookmark.description = desc;
		myBookmark.uri = uri;
		console.log(myBookmark);
		myBookmark.$post({userName : $userName}, myBookmark);
		
	};
	
}]);