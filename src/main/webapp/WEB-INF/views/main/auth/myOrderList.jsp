<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/main/auth/login_social.js"></script>
</head>
<body>

<div id="notebooks" ng-app="notebooks" ng-controller="NotebookListCtrl">
  <input type="text" id="query" ng-model="query"/>
  <select ng-model="orderList">
    <option value="name">By name</option>
    <option value="-age">Newest</option>
    <option value="age">Oldest</option>
  </select>
  <ul id="notebook_ul">
    <li ng-repeat="notebook in notebooks | filter:query | orderBy: orderList">
      name: {{not.name}}<br/>
      <div class="right top">{{not.price}}</div>
    </li>
  </ul>
  <span>Number of notebooks: {{not.length}}</span>
</div>










</body>
</html>