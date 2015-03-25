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
public class StaticControllerTest {
	
    @Autowired
    WebApplicationContext ctx;
 
    MockMvc mvc;
    
    @Before 
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }
    
    @Test
    public void testIndex() throws Exception {
    	MvcResult result = this.mvc.perform(get("/"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testNews() throws Exception {
    	MvcResult result = this.mvc.perform(get("/news"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testProject() throws Exception {
    	MvcResult result = this.mvc.perform(get("/project"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testContributors() throws Exception {
    	MvcResult result = this.mvc.perform(get("/contributors"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testScreenshots() throws Exception {
    	MvcResult result = this.mvc.perform(get("/screenshots"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testContribute() throws Exception {
    	MvcResult result = this.mvc.perform(get("/contribute"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testMods() throws Exception {
    	MvcResult result = this.mvc.perform(get("/mods"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testPlayCardshifter() throws Exception {
    	MvcResult result = this.mvc.perform(get("/play-cardshifter"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
    
    @Test
    public void testNewMod() throws Exception {
    	MvcResult result = this.mvc.perform(get("/new-mod"))
    	.andExpect(status().isOk())
    	.andExpect(view().name("template"))
    	.andReturn();
    	
        String content = result.getResponse().getContentAsString();
        assertNotNull(content);
    }
 

}
