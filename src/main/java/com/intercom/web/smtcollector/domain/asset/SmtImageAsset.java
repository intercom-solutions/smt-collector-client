package com.intercom.web.smtcollector.domain.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import java.net.URL;
import java.util.Date;
import org.apache.commons.lang3.Validate;

public abstract class SmtImageAsset extends SmtAsset {

	public enum Source implements SmtValueObject<Source> {

		BRANDBANK {
			@Override
			public boolean isBrandbank() {
				return true;
			}

		}, ELVIS {
			@Override
			public boolean isElvis() {
				return true;
			}

		}, SMT_COLLECTOR {
			@Override
			public boolean isSmtCollector() {
				return true;
			}

		};

		public boolean isBrandbank() {
			return false;
		}

		public boolean isElvis() {
			return false;
		}

		public boolean isSmtCollector() {
			return false;
		}

		@Override
		public boolean sameValueAs(Source other) {
			return ((other != null) && (this.equals(other)));
		}

	}
	private Source source = Source.SMT_COLLECTOR;
	private int width;
	private int height;

	protected SmtImageAsset() {
		super();
	}

	public SmtImageAsset(SmtAssetName name, String mimeType, long size, URL originalUrl, URL thumbnailUrl, URL previewUrl, Source source, int width, int height, Date creationDate, String creationUser) {
		super(name, mimeType, size, originalUrl, thumbnailUrl, previewUrl, creationDate, creationUser);
		Validate.notNull(source, "The \"source\" parameter can not be null");
		this.source = source;
		this.width = width;
		this.height = height;
	}

	@JsonProperty(value = "source")
	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@JsonProperty(value = "width")
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@JsonProperty(value = "height")
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
