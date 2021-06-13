package edu.infnet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/BancoMoney")
public class TransacaoServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

//	private static Logger logger = LogManager.getLogger(TransacaoServlet.class);
//
//	private TransacaoService transacaoService;
//	private ContaService contaService;
//	private ClienteService clienteService;

//	public TransacaoServlet() {
//		transacaoService = new TransacaoService();
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		logger.info("Requisição recebida em TransacaoService - doGet");
//		
		String paginaResposta = "pages/home.jsp";
//		String titulo = "Transações - ATM";
//		String botao = "Cadastrar";
//
//		String action = req.getParameter("action");
//		logger.info("action = " + action);
//		String nextFormAction = "";
//
//		if ("sacar".equals(action)) {
//			paginaResposta = "pages/saque.jsp";
//			Integer numero = Integer.parseInt(req.getParameter("numero"));
//			Conta conta = contaService.findById(numero);
//			req.setAttribute("conta", conta);
//		} else if ("depositar".equals(action)) {
//			paginaResposta = "pages/deposito.jsp";
//			nextFormAction = "new";
//		} else if ("saldo".equals(action)) {
//			Integer numero = Integer.parseInt(req.getParameter("numero"));
//			List<Transacao> transacoes = new ArrayList<>();
//			transacoes.forEach(transacao -> transacoes.add(transacao));
//			req.setAttribute("transacoes", transacoes);
//			transacoes.forEach(p -> logger.info(p));
//		} 
//
//		req.setAttribute("action", nextFormAction);
//		req.setAttribute("titulo", titulo);
//		req.setAttribute("botao", botao);
//
		req.getRequestDispatcher(paginaResposta).forward(req, resp);

	}
//
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		logger.info("Requisição recebida em TransacaoService - doPost");
//		String paginaResposta = "pages/home.jsp";
//
//		String action = req.getParameter("action");
//		
//		if ("sacar".equals(action)) {
//
//			Patrimonio patrimonio = getPatrimonioFromRequest(req);
//
//			if (service.save(patrimonio)) {
//				req.getSession().setAttribute("sucesso", "O patrimônio " + patrimonio.getDescricao() + " foi cadastrado com sucesso");
//			} else {
//				req.getSession().setAttribute("erro", "Erro ao cadastrar patrimônio");
//			}
//
//		} else if ("depositar".equals(action)) {
//
//			Patrimonio patrimonio = getPatrimonioFromRequest(req);
//			Integer id = Integer.parseInt(req.getParameter("id"));
//			patrimonio.setId(id);
//			
//			if (service.update(patrimonio)) {
//				req.getSession().setAttribute("sucesso", "O patrimônio " + patrimonio.getDescricao() + " foi alterado com sucesso");
//			} else {
//				req.getSession().setAttribute("erro", "Erro ao alterar o patrimônio");
//			}
//		} else if ("saldo".equals(action)) {
//			
//			Integer id = Integer.parseInt(req.getParameter("id"));
//			service.delete(id);
//			req.getSession().setAttribute("sucesso", "O patrimônio foi deletado com sucesso");
//		}
//
//		List<Patrimonio> patrimonios = service.getPatrimonios();
//		req.getSession().setAttribute("patrimonios", patrimonios);
//		resp.sendRedirect(paginaResposta);
		
		doGet(req, resp);
	
	}
//
//	private Patrimonio getPatrimonioFromRequest(HttpServletRequest req) throws IOException, ServletException {
//
//		String descricao = req.getParameter("descricao");
//		String localizacao = req.getParameter("localizacao");
//
//		return new Patrimonio(descricao, localizacao);
//	}

}
