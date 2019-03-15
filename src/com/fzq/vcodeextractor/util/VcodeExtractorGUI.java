package com.fzq.vcodeextractor.util;
import org.apache.jmeter.processor.gui.AbstractPostProcessorGui;
import org.apache.jmeter.testelement.TestElement;

public class VcodeExtractorGUI extends AbstractPostProcessorGui{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Override
    public TestElement createTestElement() {
        // TODO Auto-generated method stub
        VcodeExtractor extractor = new VcodeExtractor();
        modifyTestElement(extractor);
        return extractor;
    }

    @Override
    public String getLabelResource() {
        // TODO Auto-generated method stub
        return this.getClass().getName();
    }

    @Override
    public String getStaticLabel() {//…Ë÷√œ‘ æ√˚≥∆
        // TODO Auto-generated method stub
        return "VcodeExtractor";
    }

    @Override
    public void modifyTestElement(TestElement extractor) {
        // TODO Auto-generated method stub
        super.configureTestElement(extractor);

    }
}