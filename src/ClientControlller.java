import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class ClientControlller {
	 @Autowired  
	 ClientDAO dao;
	 
	 @RequestMapping("/clientform")
	 public ModelAndView showForm() {
		 return new ModelAndView("clientform", "command", new Client());  
	 }
	 
	 
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute Client c) {
		 dao.save(c);
		 return new ModelAndView("redirect:/clients");
	 }
	 
	 @RequestMapping("/clients") 
	 public ModelAndView viewClients() {
		 List<Client> clients = dao.getClients();
		 return new ModelAndView("clients","clients",clients);
	 }
	 
	 @RequestMapping(value="/editclient/{cnpj}")
	 public ModelAndView edit(@PathVariable String cnpj) {
		 Client c = dao.getClientByCnpj(cnpj);
		 return new ModelAndView("editclientform","command", c);
	 }
	 
	 @RequestMapping("/editsave")
	 public ModelAndView editSave(@ModelAttribute Client c) {
		 dao.update(c);
		 return new ModelAndView("redirect:/clients");
	 }
	 
	 @RequestMapping(value="deleteclient/{cnpj}", method = RequestMethod.GET)
	 public ModelAndView delete(@PathVariable String cnpj) {
		 dao.delete(cnpj);
		 return new ModelAndView("redirect:/clients");
	 }
	 
}
