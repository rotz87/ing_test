var bookmarkControllers = angular.module('bookmarkControllers',[])

bookmarkControllers.controller('bookmarkDtlCtrl',['$scope','BookMark',
    function($scope,BookMark) {
	BookMark.get(function(response){
    	  $scope.bookmark = response;
    	  
      });
	}]);

bookmarkControllers.controller('changeBookmark',['$scope', 'BookMark',function($scope,BookMark){
	$scope.customBookmark = '1/bookmarks/2';
	$scope.tmpBookmark = "0/bookmarks/0";
	var values = [];
	values = $scope.customBookmark.split("/bookmarks/");
	$scope.newBookmark = function(tmpBookmark){
		if(tmpBookmark)
		{
		values = tmpBookmark.split("/bookmarks/");
		console.log(values)
		}
		BookMark.get({mybookmark:values[0],booknumber:values[1]},function(response){
			
			$scope.bookmark = response;
			
		})
	}
}]);
