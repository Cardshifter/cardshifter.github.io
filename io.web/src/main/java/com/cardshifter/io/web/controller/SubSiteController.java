package com.cardshifter.io.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/{subSite}")
@Controller
public class SubSiteController {
	
	// General links
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model, @PathVariable("subSite") String subSite) {
		return subSite + "/index";
	}
	@RequestMapping(value = "/game-rules", method = RequestMethod.GET)
	public String gameRules(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/game-rules";
	}
	
	// Cards links
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/cards";
	}
	@RequestMapping(value = "/cards-bio", method = RequestMethod.GET)
	public String cardsBio(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/cards-bio";
	}	
	@RequestMapping(value = "/cards-mech", method = RequestMethod.GET)
	public String cardsMech(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/cards-mech";
	}
	@RequestMapping(value = "/cards-cybernetics", method = RequestMethod.GET)
	public String cardsCybernetics(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/cards-cybernetics";
	}
	
	// Factions links
	@RequestMapping(value = "/factions", method = RequestMethod.GET)
	public String factions(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/factions";
	}
	@RequestMapping(value = "/faction-planet-corp", method = RequestMethod.GET)
	public String factionPlanetCorp(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-planet-corp";
	}
	@RequestMapping(value = "/faction-blackout", method = RequestMethod.GET)
	public String factionBlackout(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-blackout";
	}
	@RequestMapping(value = "/faction-esu", method = RequestMethod.GET)
	public String factionEsu(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-esu";
	}
	@RequestMapping(value = "/faction-tyrakk", method = RequestMethod.GET)
	public String factionTyrakk(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-tyrakk";
	}
	@RequestMapping(value = "/faction-celescion", method = RequestMethod.GET)
	public String factionCelescion(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-celescion";
	}
	@RequestMapping(value = "/faction-bioshell", method = RequestMethod.GET)
	public String factionBioshell(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/faction-bioshell";
	}
	
	// Story links
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story";
	}
	@RequestMapping(value = "/story-prelude", method = RequestMethod.GET)
	public String storyPrelude(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story-prelude";
	}
	@RequestMapping(value = "/story-invasion", method = RequestMethod.GET)
	public String storyInvasion(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story-invasion";
	}
	@RequestMapping(value = "/story-corruption", method = RequestMethod.GET)
	public String storyCorruption(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story-corruption";
	}
	@RequestMapping(value = "/story-enter", method = RequestMethod.GET)
	public String storyEnter(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story-enter";
	}
}
