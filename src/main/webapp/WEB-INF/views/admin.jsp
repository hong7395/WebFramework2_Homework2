<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="container-wrapper">
	<div class="container">
		<h2>Administrator Page</h2>
		<p class="lead">Product 관리 가능 페이지임당~</p>
	</div>
	
	<div class="container">
		<h2> <a href="<c:url value="/admin/productInventory"/>">Product Inventory</a> </h2>
		<p class="lead"> Here you can view, check, modify the product Inventory !!!</p>
	</div>
</div>