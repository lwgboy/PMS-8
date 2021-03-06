<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Amaze UI Examples</title>
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="css/amazeui.min.css">
<link rel="stylesheet" href="css/app.css">
<title>添加用户成功</title>
</head>
<body>
	<div class="am-g myapp-login">
		<div class="myapp-login-bg">
			<div data-am-widget="tabs" class="am-tabs am-tabs-d2">
				<ul class="am-tabs-nav am-cf">
					<li class="am-active"><a href="[data-tab-panel-0]">SIGN IN</a></li>
					<li class=""><a href="[data-tab-panel-1]">PHONE IN</a></li>

				</ul>
				<div class="am-tabs-bd">
					<div data-tab-panel-0 class="am-tab-panel am-active">
						<form action="./user/login" class="am-form">
							<fieldset>
								<div class="am-form-group">
									<label for="doc-vld-name">User Name</label> <input type="text"
										id="doc-vld-name" name="name" minlength="3"
										placeholder="User ID" class="am-form-field" required />
								</div>
								<div class="am-form-group">
									<label for="doc-vld-name">Password</label> <input
										type="password" id="doc-vld-name" name="password"
										minlength="3" placeholder="User Password"
										class="am-form-field" required />
								</div>
								<div class="am-form-group myapp-login-treaty">
									<label class="am-form-label"></label><label
										class="am-checkbox-inline"> <input type="checkbox"
										value="橘子" name="docVlCb" minchecked="2" maxchecked="4"
										required="">已同意使用条约
									</label>
								</div>
								<button class="myapp-login-button am-btn am-btn-secondary"
									type="submit">SIGN IN</button>
							</fieldset>
							<legend>Forgot Password?</legend>
						</form>
					</div>
					<div data-tab-panel-1 class="am-tab-panel ">
						<form action="" class="am-form">
							<fieldset>
								<div class="am-form-group">
									<label for="doc-vld-name">Mobile Phone</label> <input
										type="text" id="doc-vld-name" minlength="3"
										placeholder="Number" class="am-form-field" required />
								</div>
								<div class="am-form-group">
									<label for="doc-vld-name">Identifying Code</label> <input
										type="password" id="doc-vld-name" minlength="3"
										placeholder="Code" class="am-form-field" required />
								</div>
								<div class="am-form-group myapp-login-treaty">
									<label class="am-form-label"></label><label
										class="am-checkbox-inline"> <input type="checkbox"
										value="橘子" name="docVlCb" minchecked="2" maxchecked="4"
										required="">已同意使用条约
									</label>
								</div>
								<button class="myapp-login-button am-btn am-btn-secondary"
									type="submit">SIGN IN</button>
							</fieldset>
							<legend>Forgot Password?</legend>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="js/jquery.min.js"></script>
	<!--<![endif]-->
	<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
	<script src="js/amazeui.min.js"></script>
	<script src="js/app.js"></script>
</body>
</html>