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

greetingControllers.controller('SpicyController', ['$scope', function($scope) {
$scope.customSpice = "wasabi";
$scope.spice = 'very';

$scope.spicy = function(spice) {
  $scope.spice = spice;
};
}]);