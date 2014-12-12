var bookmarkServices = angular.module('bookmarkServices',['ngResource']);

bookmarkServices.factory('BookMark',['$resource',
 		function($resource){
			return $resource('../../request/:userName/bookmarks/:booknumber',
					null ,
				{
				'query': {method:'GET', params:{userName:'@userName'}, isArray:true},
			    'post': {method:'POST', params:{userName:'@userName'}},
			    'update': {method:'PUT', params:{userName:'@userName', booknumber:'@booknumber'}},
			    'remove': {method:'DELETE'}
				});
 		}]);