var bookmarkControllers = angular.module('bookmarkControllers',[])

bookmarkControllers.controller('changeBookmark',['$scope', 'BookMark',function($scope,BookMark){
	$scope.customBookmark = 'arnaldo/bookmarks/';
	$scope.tmpUser = "arnaldo";
	
	$scope.newBookmark = function(tmpUser){
	$tmpUser = tmpUser;
	var allBookmarks = BookMark.query({userName:$tmpUser},function(){
		$scope.bookmarks = allBookmarks;
		});
	}
		//BookMark.update({userName : $scope.userName , booknumber : $scope.booknumber});
	
}]);