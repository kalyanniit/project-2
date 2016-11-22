var chatnow=angular.module('chatnow',['ngRoute']);
chatnow.config(function($routeProvider)
{
$routeProvider.when('/register1',
{
templateUrl:'views/register1.html',
controller:'registerController'
}).when('/login',
{
templateUrl : 'views/login.html',
controller : 'loginController'
}).when('/chat',
{
templateUrl : 'views/chat.html',
controller : 'chatController'
});
});
chatnow.controller('registerController',function($scope,$http)
{
console.log("iam in register controller");
$scope.register1=function()
{
console.log("in register function");
console.log("username:"+$scope.username);

console.log("password:"+$scope.password);

console.log("emailid:"+$scope.emailid);
console.log("contact:"+$scope.contact);

var UserDetails =
	{
		username:$scope.username,
		password:$scope.password,
		emailid:$scope.emailid,
		contact:$scope.contact
		
		
		
	};
      console.log("name:"+UserDetails.firstname);
      
      var res =$http.post("http://localhost:8080/chat/addUser",UserDetails);
      res.success(function(data,status,header,config)
    		  {
    	  console.log("status:"+status);

});
}
});