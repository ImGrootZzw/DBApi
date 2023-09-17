package com.gitee.freakchicken.dbapi.plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TransformPlugin implements BasePlugin {

    public Logger logger = LoggerFactory.getLogger(TransformPlugin.class);

    public abstract void init();

    public abstract Object transform(Object data, String localPluginParam);
}
