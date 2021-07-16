<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%-- 
    Document   : order-detail
    Created on : Jul 15, 2021, 7:48:59 PM
    Author     : Administrator
--%>
<input type="hidden" id="totalPage" value="${totalPage}">
<c:forEach var="o" items="${listO}">
    <tr class="rem"  >
        <td id="cid" class="invert">${o.oid}</td>
        <td class="invert">${o.date}</td>
        <td class="invert">
            <select onchange="changeStatus('${o.oid}',this)" class="form-control" id="changeStatus" name="status">                               
                <option ${o.status == 0?"selected":""} value="0">Processing</option>
                <option ${o.status == 1?"selected":""} value="1">Delivering</option>
                <option ${o.status == 2?"selected":""} value="2">Delivered</option>                     
            </select> 
        </td>                           
        <td class="invert">${o.total}</td>
        <td class="invert">${o.payid==1?"COD":"Internet Banking"}</td>   
        <td><a href="#" style="text-decoration: none" onclick="orderDetail('${o.oid}', '${o.cname}', '${o.cphone}', '${o.cAddress}', '${o.total}')">Detail</a></td>
        <td class="invert">
            <button id="${o.oid}" type="button" onclick="deleteOrder('${o.oid}',this)" <c:if test="${o.status!=0}">disabled="true"</c:if>  class="btn btn-danger">DELETE</button>
            </td>
        </tr>
</c:forEach>
