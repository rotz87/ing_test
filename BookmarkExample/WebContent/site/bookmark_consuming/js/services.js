var bookmarkServices = angular.module('bookmarkServices',['ngResource']);

bookmarkServices.factory('BookMark',['$resource',
 		function($resource){
			var tmpres = $resource('../../request/:mybookmark/bookmarks/:booknumber',{mybookmark:'1', booknumber:'2'})
			
 			return tmpres;
 		}]);