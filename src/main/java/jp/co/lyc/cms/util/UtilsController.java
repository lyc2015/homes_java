package jp.co.lyc.cms.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.lyc.cms.model.ModelClass;
import jp.co.lyc.cms.service.UtilsService;

@Controller
public class UtilsController {

	// 防止附件名字亂碼
	static {
		System.getProperties().setProperty("mail.mime.splitlongparameters", "false");
	}

	@Autowired
	UtilsService utilsService;

	public static Map<String, String> JapanHoliday = new HashMap<String, String>();
	static {
		StringBuffer json = new StringBuffer();
		try {
			URL url = new URL("https://holidays-jp.github.io/api/v1/date.json");
			InputStream is = url.openStream(); // throws an IOException
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String line = "";
			while ((line = br.readLine()) != null) {
				json.append(line);
			}
		} catch (Exception e) {
		}
		com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSON.parseObject(json.toString());
		// String yearMonth = (String)jsonObject.getOrDefault("yearMonth", "");
		Set<String> keys = jsonObject.keySet();
		for (String key : keys) {
			JapanHoliday.put(key, jsonObject.getString(key));
		}
	}

	/**
	 * 国籍を取得
	 * 
	 * @return
	 */
	@PostMapping("/getNationality")
	@ResponseBody
	public List<ModelClass> getNationality() {
		List<ModelClass> list = utilsService.getNationalitys();
		return list;
	}
}