package com.cardshifter.io.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { TestConfig.class })
//@WebAppConfiguration
public class CyborgChroniclesControllerTest {
	//private static final String CYBORG = "/cyborg-chronicles";
    @Autowired
    WebApplicationContext ctx;
 
//    MockMvc mvc;
//    
//    @Before 
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
//    }
//    
//    @Test
//    public void testIndex() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test 
//    public void testGameRules() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/game-rules"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testCards() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testCardsBio() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-bio"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testCardsMech() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-mech"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testCardsCybernetic() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-cybernetic"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactions() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/factions"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionPlanetCorp() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-planet-corp"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionBlackout() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-blackout"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionEsu() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-esu"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionTyrakk() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-tyrakk"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionCelescion() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-celescion"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testFactionBioshell() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-bioshell"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testStory() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/story"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testStoryPrelude() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testStoryInvasion() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-invasion"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testStoryCorruption() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-corruption"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testStoryEnter() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-enter"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
//    
//    @Test
//    public void testPageTemplate() throws Exception {
//    	MvcResult result = this.mvc.perform(get(CYBORG +"/page-template"))
//    	.andExpect(status().isOk())
//    	.andExpect(view().name(CYBORG + "/template"))
//    	.andReturn();
//    	
//        String content = result.getResponse().getContentAsString();
//        assertNotNull(content);
//    }
}
