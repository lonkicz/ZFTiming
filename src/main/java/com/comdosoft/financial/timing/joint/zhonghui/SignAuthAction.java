package com.comdosoft.financial.timing.joint.zhonghui;

import java.io.InputStream;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 协议签名
 * @author wu
 *
 */
public class SignAuthAction extends RequireLoginAction {
	
	private InputStream signature;

	public SignAuthAction(String phoneNum, String password,
			String position, String appVersion, InputStream signature) {
		super(phoneNum, password, position, appVersion);
		this.signature = signature;
	}

	@Override
	protected Map<String, InputStream> fileParams() {
		Map<String, InputStream> fileParams = Maps.newHashMap();
		fileParams.put("signature", signature);
		return fileParams;
	}

	@Override
	public String url() {
		return "/user/signatureAuth";
	}

	@Override
	protected Class<? extends Result> getResultType() {
		return Result.class;
	}

	@Override
	protected int checkIndex() {
		return 3;
	}

}
