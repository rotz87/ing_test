var greetingServices = angular.module('greetingServices',['ngResource']);

greetingServices.factory('Greeting',['$resource',
 		function($resource){
			var tmpres = $resource('../../request/greeting',{})

 			return tmpres;
 		}]);