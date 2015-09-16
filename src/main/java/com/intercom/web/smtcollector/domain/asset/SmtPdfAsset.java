package com.intercom.web.smtcollector.domain.asset;

import java.net.URL;
import java.util.Date;

public abstract class SmtPdfAsset extends SmtAsset {

	protected SmtPdfAsset() {
		super();
	}

	public SmtPdfAsset(SmtAssetName name, String mimeType, long size, URL originalUrl, URL thumbnailUrl, URL previewUrl, Date creationDate, String creationUser) {
		super(name, mimeType, size, originalUrl, thumbnailUrl, previewUrl, creationDate, creationUser);
	}

}
