<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;" />
        <base href="<%=basePath%>">

        <title>库存管理</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="js/plugins/spinner/jquery.mousewheel.js"></script>

<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<script type="text/javascript" src="js/plugins/charts/excanvas.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.flot.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.flot.orderBars.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.flot.pie.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.flot.resize.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>

<script type="text/javascript" src="js/plugins/forms/uniform.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.cleditor.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/autogrowtextarea.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.dualListBox.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.inputlimiter.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/chosen.jquery.min.js"></script>

<script type="text/javascript" src="js/plugins/wizard/jquery.form.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.wizard.js"></script>

<script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>

<script type="text/javascript" src="js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="js/plugins/tables/resizable.min.js"></script>

<script type="text/javascript" src="js/plugins/ui/jquery.tipsy.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.progress.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.timeentry.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.colorpicker.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.jgrowl.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.breadcrumbs.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.sourcerer.js"></script>

<script type="text/javascript" src="js/plugins/calendar.min.js"></script>
<script type="text/javascript" src="js/plugins/elfinder.min.js"></script>

<script type="text/javascript" src="js/custom.js"></script>

<script type="text/javascript" src="js/charts/chart.js"></script>

<!-- Shared on MafiaShare.net  --><!-- Shared on MafiaShare.net  --></head>

<body>

<!-- Left side content -->
        <div id="leftSide">
            <div class="logo">
                <img src="images/logo.png"
                        alt="" />
                </a>
            </div>
            <!-- fjdskfjdkfd -->

            <div class="sidebarSep mt0"></div>


            <!-- Left navigation -->
            <ul id="menu" class="nav">
                <li class="dash">
                    <a href="<%=basePath%>index.jsp" title="" class="active"><span>首页</span>
                    </a>
                </li>

                <li class="forms">
                    <a href="#" title="" class="exp"><span>进货管理</span><strong>2</strong>
                    </a>
                    <ul class="sub">
                        <li>
                            <a href="#" title="" class="exp"><span>进货单</span><strong>2</strong>
                            </a>
                            <ul class="sub">
                                <!--<li>
                                    <a href="<%=basePath%>storeactions/add.action" title="">添加进货单</a>
                                </li>-->
                                <!--<li><a href="#" title="">修改进货单</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>store/list.action" title="">查询进货单</a>
                                </li>
                            </ul>
                        </li>
                        <li class="last">
                            <a href="#" title="" class="exp"><span>进货退货</span><strong>2</strong>
                            </a>
                            <ul class="sub">
                                <!--<li>
                                    <a href="<%=basePath%>store/addr.action" title="">添加退货单</a>
                                </li>-->
                                <!--<li><a href="#" title="">修改进货单</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>store/listr.action" title="">查询退货单</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>

                <li class="forms">
                    <a href="#" title="" class="exp"><span>销售管理</span><strong>2</strong>
                    </a>
                    <ul class="sub">
                        <li>
                            <a href="#" title="" class="exp"><span>销售单</span><strong>2</strong>
                            </a>
                            <ul class="sub">
                                <!--<li>
                                    <a href="<%=basePath%>sell/add.action" title="">查询销售单详情</a>
                                </li>-->
                                <!--<li><a href="#" title="">修改进货单</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>sell/list.action" title="">查询销售单</a>
                                </li>
                            </ul>
                        </li>
                        <li class="last">
                            <a href="#" title="" class="exp"><span>销售退货单</span><strong>2</strong>
                            </a>
                            <ul class="sub">
                                <!--<li>
                                    <a href="<%=basePath%>sellactions/addr.action" title="">添加销售退货单</a>
                                </li>-->
                                <!--<li><a href="#" title="">修改进货单</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>sell/listr.action" title="">查询销售退货单</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="forms">
                    <a href="#" title="" class="exp"><span>库存管理</span><strong>2</strong>
                    </a>
                    <ul class="sub">
                        <li>
                            <a href="<%=basePath%>inventory/list.action" title="">库存信息查询</a>
                        </li>
                        <!--<li><a href="#" title="">库存修改</a></li>
                        <li class="last"><a href="system_modifyStoreNum.html" title="">库存增加</a></li>-->
                        <li class="last">
                            <a href="<%=basePath%>/record/list.action" title="">查询库存明细</a>
                        </li>
                        <!-- 没改 -->
                    </ul>
                </li>

                <li class="tables">
                    <a href="#" title="" class="exp"><span>信息管理</span><strong>5</strong>
                    </a>
                    <ul class="sub">

                        <li>
                            <a href="#" title="" class="exp"><span>商品信息</span><strong>1</strong>
                            </a>
                            <ul class="sub">
                                <!-- <li><a href="system_addGoods.html" title="">增加商品信息</a></li>
                        <li><a href="system_modifyGoods.html" title="">商品信息修改</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>goods/list.action" title="">商品信息查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#" title="" class="exp"><span>供应商信息</span><strong>3</strong>
                            </a>
                            <ul class="sub">
                                <!-- <li><a href="system_addBrokerage.html" title="">增加供应商信息</a></li>
                        <li><a href="system_modifyBrokerage.html" title="">供应商信息修改</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>supplier/list.action" title="">供应商信息查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#" title="" class="exp"><span>VIP客户信息</span><strong>1</strong>
                            </a>
                            <ul class="sub">
                                <!-- <li><a href="<%=basePath%>client/list.action" title="">增加VIP客户信息</a></li>
                        <li><a href="system_modifyCustomer.html" title="">VIP客户信息修改</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>client/list.action" title="">VIP客户信息查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#" title="" class="exp"><span>经手人信息</span><strong>1</strong>
                            </a>
                            <ul class="sub">
                                <!-- <li><a href="system_addHandle.html" title="">增加经手人信息</a></li>
                        <li><a href="system_modifyHandle.html" title="">经手人信息修改</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>customer/list.action" title="">经手人信息查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#" title="" class="exp"><span>商品类别信息</span><strong>1</strong>
                            </a>
                            <ul class="sub">
                                <!-- <li><a href="system_addGoodsType.html" title="">增加商品类别信息</a></li>
                        <li><a href="system_modifyGoodsType.html" title="">商品类别信息修改</a></li>-->
                                <li class="last">
                                    <a href="<%=basePath%>goodsType/list.action" title="">商品类别信息查询</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>


        <!-- Right side -->
        <div id="rightSide">

            <!-- Top fixed navigation -->
            <div class="topNav">
                <div class="wrapper">
                    <div class="welcome">
                        <a href="#" title=""><img src="images/userPic.png" alt="" />
                        </a><span>hello ${user.UUid}</span>
                    </div>
                    <div class="userNav">
                        <ul>
                            <li>
                                <a href="<%=basePath%>login/login.action" title=""><img
                                        src="images/icons/topnav/logout.png" alt="" /><span>Logout</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
    
    <!-- Responsive header -->
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>>>库存>>新增库存</h5>
            </div>
            <div class="middleNav">
                <ul>
                    <li class="mUser"><a title=""><span class="users"></span></a>
                        <ul class="mSub1">

                        </ul>
                    </li>
                </ul>
                <div class="clear"></div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    
    <div class="line"></div>
    
    
  <!-- Main content wrapper                 html 在最后可分为多个html， 这个是进货退货销售单-->
     <div class="wrapper">
    <form method="post" action="<%=basePath%>inventory/add.action">
                <table style="width: 100%">
                <tr>
                    <td style="width: 30%; text-align: right">
                        库存ID：
                    </td>
                    <td>
                        <input type="text" name="inventory.INo" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        货物名称：
                    </td>
                    <td>
                        <input type="text" name="inventory.IGname" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        货物简称：
                    </td>
                    <td>
                        <input type="text" name="inventory.ISname" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        产地：
                    </td>
                    <td>
                        <input type="text" name="inventory.IOrigin" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        规格：
                    </td>
                    <td>
                        <input type="text" name="inventory.IStandard" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        数量：        
                    </td>
                    <td>
                        <input type="text" name="inventory.INumber" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        包装：
                    </td>
                    <td>
                        <input type="text" name="inventory.IPack" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        单位：   
                    </td>
                    <td>
                        <input type="text" name="inventory.IUnit" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        单价：   
                    </td>
                    <td>
                        <input type="text" name="inventory.IUprice" />
                    </td>
                </tr>
                <tr>
                    <td style="width: 30%; text-align: right">
                        状态：
                    </td>
                    <td>
                        <select name="inventory.IState">
                            <option value="1">
                                可用
                            </option>
                            <option value="0">
                                不可用
                            </option>
                        </select>
                    </td>
                </tr>
                
                    <td style="width: 30%; text-align: right"></td>
                    <td>
                        <input type="submit" value="提交" />
                        <a href="<%=basePath%>inventory/list.action">返回</a>
                    </td>
                </tr>
                
                <tr>
                    <td style="width: 30%; text-align: right"></td>
                    <td></td>
                </tr>
                
            </table>

</form>
    
    </div>
    
    <!-- Footer line -->
    <div id="footer">
        <div class="wrapper">As usually all rights reserved.More Templates <a href="#/" target="_blank" title="进销存管理系统">进销存管理系统</a> - Collect from <a href="#" title="进销存管理系统" target="_blank">进销存管理系统</a></div>
    </div>

</div>

<div class="clear"></div>

</body>
</html>