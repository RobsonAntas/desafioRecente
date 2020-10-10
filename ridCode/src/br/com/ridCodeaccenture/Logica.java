package br.com.ridCodeaccenture;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Logica {
	
	private String mensagem="";

	
	public String getMensagem() {
		return mensagem;
	}
	

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public Logica() {
		
	}
	
	public String traduz(HttpServletRequest request, HttpServletResponse response){
	    
		String codigo =request.getParameter("codigo");
		String code[] = codigo.split(" ");
		
		int len = code.length;
		for(int k=0;k<=len-1;k++) {
			int num = Integer.parseInt(code[k]);
			System.out.println(num);
			
			switch(num) {
		      case 2:
		    	  this.mensagem+="a";
		    	  break;		    	  
		      case 22:
		    	  this.mensagem+="b";
		    	  break;
		      case 222:
		    	  this.mensagem+="c";
		    	  break;
		      case 3:
		    	  this.mensagem+="d";
		    	  break;
		      case 33:
		    	  this.mensagem+="e";
		    	  break;
		      case 333:
		    	  this.mensagem+="f";
		    	  break;
		      case 4:
		    	  this.mensagem+="g";		    
		    	  break;
		      case 44:
		    	  this.mensagem+="h";		    
		    	  break;
		      case 444:
		    	  this.mensagem+="i";	    
		    	  break;
		      case 5:
		    	  this.mensagem+="j";	    
		    	  break;
		      case 55:
		    	  this.mensagem+="k";
		    	  break;
		      case 555:
		    	  this.mensagem+="l";
		    	  break;
		      case 6:
		    	  this.mensagem+="m";
		    	  break;
		      case 66:
		    	  this.mensagem+="n";
		    	  break;
		      case 666:
		    	  this.mensagem+="o";
		    	  break;
		      case 7:
		    	  this.mensagem+="p";
		    	  break;
		      case 77:
		    	  this.mensagem+="q";
		    	  break;
		      case 777:
		    	  this.mensagem+="r";
		    	  break;
		      case 7777:
		    	  this.mensagem+="s";
		    	  break;
		      case 8:
		    	  this.mensagem+="t";
		    	  break;
		      case 88:
		    	  this.mensagem+="u";
		    	  break;
		      case 888:
		    	  this.mensagem+="v";
		    	  break;
		      case 9:
		    	  this.mensagem+="w";
		    	  break;
		      case 99:
		    	  this.mensagem+="x";
		    	  break;
		      case 999:
		    	  this.mensagem+="y";
		    	  break;
		      case 10:
		    	  this.mensagem+="z";
		    	  break;
		    	  
		      default:
		    	  this.mensagem+="nada";	
		    	  
		      }
			
		}
		
		String captalize = getMensagem();
		captalize=captalize.substring(0, 1).toUpperCase()+captalize.substring(1);
		System.out.println(captalize);
		setMensagem(captalize);
		request.setAttribute("palavra",getMensagem());
		return "inicio.jsp";
	}

}
