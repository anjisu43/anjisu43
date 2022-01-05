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
         <legned>회원가입 시스템</legend>
         <table>
            <tr>
               <td>아이디</td>
               <td><input type="text" name="id">
               </td>
            </tr>
            <tr>
               <td>비밀번호</td>
               <td><input type="password" name="pw"></td>
            </tr>
            <tr>
               <td>닉네임</td>
               <td><input type="text" name="nick"></td>
            </tr>
            <tr>
               <td>전화번호</td>
               <td><input type="text" name="phone"></td>
            </tr>
            <tr>
               <td colspan="2"><input type="submit" value="회원가입"></td>
            </tr>
         </table>
      </fieldset>
   </form>
</body>
</html>