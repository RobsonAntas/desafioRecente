<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Traduzir Código</title>
</head>
<body>

<form action="rid" method=post>
<table>
<tr>
<td>Código<input id="setCodigo" type="text" value="" name="codigo"/></td><td><input type="submit" value="traduzir"/></td>
</tr>
<tr>
<td>Mensagem<input id="getMensagem" type="text" value="${palavra}"/></td>
</tr>

</table>
<br/><br/>
</form>

<p id="tamanho"></p>

<table>
<tr>
<td><Button id="2" type="button" onclick="codigo(this.id)">2</Button></td>
<td><Button id="22" type="button" onclick="codigo(this.id)">22</Button></td>
<td><Button id="222"  type="button" onclick="codigo(this.id)">222</Button></td>
<td><Button id="333"  type="button" onclick="codigo(this.id)">333</Button></td>
</tr>

<tr>
<td><Button id="3" type="button" onclick="codigo(this.id)">3</Button></td>
<td><Button id="33" type="button" onclick="codigo(this.id)">33</Button></td>
<td><Button id="444" type="button" onclick="codigo(this.id)">444</Button></td>
<td><Button id="555" type="button" onclick="codigo(this.id)">555</Button></td>
</tr>

<tr>

<td><Button id="4" type="button" onclick="codigo(this.id)">4</Button></td>
<td><Button id="44" type="button" onclick="codigo(this.id)">44</Button></td>
<td><Button id="666" type="button" onclick="codigo(this.id)">666</Button></td>
<td><Button id="777" type="button" onclick="codigo(this.id)">777</Button></td>
</tr>

<tr>
<td><Button id="5" type="button" onclick="codigo(this.id)">5</Button></td>
<td><Button id="55" type="button" onclick="codigo(this.id)">55</Button></td>
<td><Button id="888" type="button" onclick="codigo(this.id)">888</Button></td>
<td><Button id="7777" type="button" onclick="codigo(this.id)">700</Button></td>
</tr>

<tr>
<td><Button id="6" type="button" onclick="codigo(this.id)">6</Button></td>
<td><Button id="66" type="button" onclick="codigo(this.id)">66</Button></td>
<td><Button id="999" type="button" onclick="codigo(this.id)">999</Button></td>
<td><Button id="10" type="button" onclick="codigo(this.id)">100</Button></td>
</tr>

<tr>
<td><Button id="7" type="button" onclick="codigo(this.id)">7</Button></td>
<td><Button id="77" type="button" onclick="codigo(this.id)">77</Button></td>
<td><Button id="9" type="button" onclick="codigo(this.id)">009</Button></td>
<td><Button id="99" type="button" onclick="codigo(this.id)">099</Button></td>
</tr>

<tr>
<td><Button id="8" type="button" onclick="codigo(this.id)">8</Button></td>
<td><Button id="88" type="button" onclick="codigo(this.id)">88</Button></td>
</tr>

</table>

<script type="text/javascript">
var m = [];    


function codigo(id){
	m[m.length]=id;
	document.getElementById('setCodigo').value=m.join(" ");
}
</script>

</body>
</html>