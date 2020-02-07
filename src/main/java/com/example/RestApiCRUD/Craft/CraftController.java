package com.example.RestApiCRUD.Craft;
import java.util.*;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class CraftController {
		
		@Autowired
		private CraftService craftservice ;

		@RequestMapping("/crafts")
		public List <Crafts> getAllcrafts() {
			return craftservice.getAllCrafts();
		}
		
		@RequestMapping("/crafts/{id}")
		public Crafts getCraft(@PathVariable String id) {
			return craftservice.getCraft(id);
			
		}
		
		@RequestMapping(method=RequestMethod.POST , value="/crafts")
        public void addCraft(@RequestBody Crafts crafts ) { 
			craftservice.addCraft(crafts);
		}
		
		@RequestMapping(method=RequestMethod.PUT , value="/crafts/{id}")
        public void updateCraft(@RequestBody Crafts crafts , @PathVariable String id ) { 
			craftservice.updateCraft(id ,crafts);
		}
		
		@RequestMapping(method=RequestMethod.DELETE , value="/crafts/{id}")
		public void deleteCraft(@PathVariable String id) {
			 craftservice.deleteCraft(id);
			
		}
		
		
		
	}


