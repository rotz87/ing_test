var greetingApp = angular.module('greetingApp', 
		[
		 'greetingControllers',
		 'greetingServices'
		 ]);

var greetingServices = angular.module('greetingServices',['ngResource']);

greetingServices.factory('Greeting',['$resource',
 		function($resource){
			var tmpres = $resource('../../request/greeting',{})

 			return tmpres;
 		}]);

var greetingControllers = angular.module('greetingControllers', []);
greetingControllers.controller('greetingDtlCtrl',['$scope','Greeting',
		function($scope,Greeting) {
		$scope.customUser = "Pluto"
		$scope.user = "Pippo"
		$scope.myUser = function (user)
		{
			
			$scope.user = user;
			Greeting.get({name: user},function(response){
		    	  $scope.greeting = response;
		      });
		}

			}]);

var myApp = angular.module('myApp',[]);
myApp.controller('SpicyController',['$scope',
		  function($scope) {
			$scope.spice = 'very';
			$scope.chiliSpicy = function(){
				$scope.spice ='chilly';
			};
			$scope.jalapenoSpicy = function(){
				$scope.spice = 'jalapeno';
			};
			
			}]);
var myApp2 = angular.module('spicyApp2', []);

myApp2.controller('SpicyController', ['$scope', function($scope) {
    $scope.customSpice = "wasabi";
    $scope.spice = 'very';

    $scope.spicy = function(spice) {
        $scope.spice = spice;
    };
}]);
