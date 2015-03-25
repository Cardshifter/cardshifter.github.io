package com.cardshifter.io.web.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cardshifter.io.web.config.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
@WebAppConfiguration
public class CyborgChroniclesControllerTest {
	private static final String CYBORG = "/cyborg-chronicles";
    @Autowired
    WebApplicationContext ctx;
 
    MockMvc mvc;
    
    @Before 
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }
    
    @Test
    public void testIndex() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    //@Test TODO fix this test since we're pointing to an inexistant view
    public void testGameRules() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/game-rules"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testCards() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testCardsBio() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-bio"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testCardsMech() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-mech"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testCardsCybernetic() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/cards-cybernetic"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactions() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/factions"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionPlanetCorp() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-planet-corp"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionBlackout() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-blackout"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionEsu() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-esu"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionTyrakk() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-tyrakk"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionCelescion() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-celescion"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testFactionBioshell() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/faction-bioshell"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testStory() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/story"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testStoryPrelude() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testStoryInvasion() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-invasion"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testStoryCorruption() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-corruption"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testStoryEnter() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/story-enter"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testPageTemplate() throws Exception {
    	MvcResult result = this.mvc.perform(get(CYBORG +"/page-template"))
    	.andExpect(status().isOk())
    	.andExpect(view().name(CYBORG + "/template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
}
