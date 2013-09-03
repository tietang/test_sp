package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import fengfei.SpruceInit;

@OnApplicationStart(async = true)
public class Bootstrap extends Job {

    static Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public void doJob() {
//        SpruceInit.loadProperties();
        logger.info("Initialized spruce configuration.");
//        SpruceInit.initApp();
        logger.info("Initialized spruce application.");

    }

}
