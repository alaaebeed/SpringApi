package com.example.RestApiCRUD.Craft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CraftService {
	
		private List <Crafts> crafts = new ArrayList <> (Arrays.asList(
			new Crafts("craft id"," craft name "," craft desc "),
			new Crafts("craft id2"," craft name2 "," craft desc2 "),
			new Crafts("craft id3"," craft name3 "," craft desc3 ")
			));
		
		public List<Crafts> getAllCrafts(){
			return crafts;
		}
		
	public Crafts getCraft(String id) {
		return crafts.stream().filter(t->t.getId().equals(id)).findFirst().get();
			
		}

	public void addCraft(Crafts craft) {
		// TODO Auto-generated method stub
		crafts.add(craft);
	}

	public void updateCraft(String id, Crafts crafts2) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<crafts.size();i++) {
			Crafts t = crafts.get(i);
			if(t.getId().equals(id)) {
				crafts.set(i, crafts2);
				return;
			}
		}
		
	}

	public void  deleteCraft(String id) {
		// TODO Auto-generated method stub
		crafts.removeIf(t->t.getId().equals(id));
	}

}
