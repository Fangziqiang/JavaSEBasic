//private static void _fillInputTextOrTextArea(WebDriver driver){
//		//text
//		
//		List inputElements = driver.findElements(By.tagName("input"));
//		for(int i=0;i<inputElements.size();i++){
//			WebElement ele = (WebElement)inputElements.get(i);
//			if(ele.isDisplayed() && ele.isEnabled()){
//				String value = ele.getAttribute("value");
//				if(value != null && !value.equals("")){
//					continue;
//				}
//				String title = ele.getAttribute("title");
//				String alt = ele.getAttribute("alt");
//				String clazz = ele.getAttribute("class");
//				if(clazz != null && clazz.equals("Wdate")){
//					ele.sendKeys(new String[] { "2016-01-01" });
//					continue;
//				}
//				//System.out.println("title = " + title + ", alt = " + alt);
//				if(alt != null && !alt.equals("")){//根据alt判断是输入数字、字符还是身份证
//					if(alt.toLowerCase().indexOf("sfz") > -1){//张仲礼 370205197405213513
//						ele.sendKeys(new String[] { "370205197405213513" });
//					}else if(alt.toLowerCase().indexOf("number") > -1){
//						//解析出number后面的数字
//						if(alt.indexOf("=") > -1){
//							String number = alt.substring(alt.indexOf("="));
//							int end = number.indexOf(")");
//							number = number.substring(1,end);
//							StringBuffer s = new StringBuffer();
//							for(int j=0;j<Integer.parseInt(number);j++){
//								s.append("7");
//							}
//							ele.sendKeys(new String[] { s.toString() });
//						}else if(alt.indexOf("(") > -1){
//							String number = alt.substring(alt.indexOf("("));
//							int end = number.indexOf(")");
//							number = number.substring(1,end);
//							StringBuffer s = new StringBuffer();
//							for(int j=0;j<Integer.parseInt(number);j++){
//								s.append("6");
//							}
//							ele.sendKeys(new String[] { s.toString() });
//						}else{
//							ele.sendKeys(new String[] { "9" });
//						}
//					}else if(alt.toLowerCase().indexOf("dhhm") > -1){
//						ele.sendKeys(new String[] { "010-62133388" });
//					}else{
//						if(title != null && !title.equals("")){//根据title输入字符
//							ele.sendKeys(new String[] { title });
//						}else{
//							ele.sendKeys(new String[] { "test" });
//						}
//					}
//				}else{
//					ele.sendKeys(new String[] { "test" });
//				}
//			}
//			//System.out.println("name = " + ele.getTagName() + ",text = " + ele.getText() + ",ele.isDisplayed() = " + ele.isDisplayed() + ",ele.isEnabled() = " + ele.isEnabled());
//		}
//		//textarea
//		List textareaElements = driver.findElements(By.tagName("textarea"));
//		for(int i=0;i<textareaElements.size();i++){
//			WebElement ele = (WebElement)textareaElements.get(i);
//			if(ele.isDisplayed() && ele.isEnabled()){
//				ele.sendKeys(new String[] { "测试" });	
//			}
//			//System.out.println("name = " + ele.getTagName() + ",text = " + ele.getText() + ",ele.isDisplayed() = " + ele.isDisplayed() + ",ele.isEnabled() = " + ele.isEnabled());
//		}
//	}