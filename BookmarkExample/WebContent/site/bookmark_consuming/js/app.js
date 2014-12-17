var bookmarkApp = angular.module('bookmarkApp', 
		[
		 'bookmarkControllers',
		 'bookmarkServices'
		 ]);
bookmarkApp.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
}
]);