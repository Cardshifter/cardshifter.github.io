package com.cardshifter.io.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/cyborg-chronicles")
@Controller
public class CyborgChroniclesController {
	private static final String CYBORG_TEMPLATE = "/cyborg-chronicles/template";
	
	// General links
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("view","index");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/game-rules", method = RequestMethod.GET)
	public String gameRules(Model model) {
		model.addAttribute("view","game-rules");
		return CYBORG_TEMPLATE;
	}
	
	// Cards links
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards(Model model) {
		model.addAttribute("view","cards");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/cards-bio", method = RequestMethod.GET)
	public String cardsBio(Model model) {
		model.addAttribute("view","cards-bio");
		return CYBORG_TEMPLATE;
	}	
	@RequestMapping(value = "/cards-mech", method = RequestMethod.GET)
	public String cardsMech(Model model) {
		model.addAttribute("view","cards-mech");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/cards-cybernetic", method = RequestMethod.GET)
	public String cardsCybernetic(Model model) {
		model.addAttribute("view","cards-cybernetic");
		return CYBORG_TEMPLATE;
	}
	
	// Factions links
	@RequestMapping(value = "/factions", method = RequestMethod.GET)
	public String factions(Model model) {
		model.addAttribute("view","factions");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-planet-corp", method = RequestMethod.GET)
	public String factionPlanetCorp(Model model) {
		model.addAttribute("view","faction-planet-corp");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-blackout", method = RequestMethod.GET)
	public String factionBlackout(Model model) {
		model.addAttribute("view","faction-blackout");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-esu", method = RequestMethod.GET)
	public String factionEsu(Model model) {
		model.addAttribute("view","faction-esu");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-tyrakk", method = RequestMethod.GET)
	public String factionTyrakk(Model model) {
		model.addAttribute("view","faction-tyrakk");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-celescion", method = RequestMethod.GET)
	public String factionCelescion(Model model) {
		model.addAttribute("view","faction-celescion");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/faction-bioshell", method = RequestMethod.GET)
	public String factionBioshell(Model model) {
		model.addAttribute("view","faction-bioshell");
		return CYBORG_TEMPLATE;
	}
	
	// Story links
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(Model model) {
		model.addAttribute("view","story");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/story-prelude", method = RequestMethod.GET)
	public String storyPrelude(Model model) {
		model.addAttribute("view","story-prelude");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/story-invasion", method = RequestMethod.GET)
	public String storyInvasion(Model model) {
		model.addAttribute("view","story-invasion");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/story-corruption", method = RequestMethod.GET)
	public String storyCorruption(Model model) {
		model.addAttribute("view","story-corruption");
		return CYBORG_TEMPLATE;
	}
	@RequestMapping(value = "/story-enter", method = RequestMethod.GET)
	public String storyEnter(Model model) {
		model.addAttribute("view","story-enter");
		return CYBORG_TEMPLATE;
	}
	// template link for reference only
		@RequestMapping(value = "/page-template", method = RequestMethod.GET)
	public String pageTemplate(Model model) {
		model.addAttribute("view","page-template");
		return CYBORG_TEMPLATE;
	}
}
