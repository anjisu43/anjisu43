<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<style>
   tr{
      align : center;
   }
   td{
      align : center;
   }
</style>
<meta charset="utf-8">
<title>Insert title here</title>

</head>
<body>
   <form action="JoinService" method="post">
      <fieldset>
         <legned>ȸ������ �ý���</legend>
         <table>
            <tr>
               <td>���̵�</td>
               <td><input type="text" name="id">
               </td>
            </tr>
            <tr>
               <td>��й�ȣ</td>
               <td><input type="password" name="pw"></td>
            </tr>
            <tr>
               <td>�г���</td>
               <td><input type="text" name="nick"></td>
            </tr>
            <tr>
               <td>��ȭ��ȣ</td>
               <td><input type="text" name="phone"></td>
            </tr>
            <tr>
               <td colspan="2"><input type="submit" value="ȸ������"></td>
            </tr>
         </table>
      </fieldset>
   </form>
</body>
</html>