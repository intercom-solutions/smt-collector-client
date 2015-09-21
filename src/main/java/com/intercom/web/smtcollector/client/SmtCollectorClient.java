package com.intercom.web.smtcollector.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.intercom.web.smtcollector.client.response.SmtBrandTypesPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtBrandsPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtDetailedErrorResponse;
import com.intercom.web.smtcollector.client.response.SmtGenericErrorResponse;
import com.intercom.web.smtcollector.client.response.SmtGroupsPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtPageable;
import com.intercom.web.smtcollector.client.response.SmtResponse;
import com.intercom.web.smtcollector.client.response.SmtVariantsPagedResponse;
import com.intercom.web.smtcollector.domain.brand.SmtBrandCode;
import com.intercom.web.smtcollector.domain.brand.SmtBrandFilter;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeCode;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeFilter;
import com.intercom.web.smtcollector.domain.group.SmtGroupCode;
import com.intercom.web.smtcollector.domain.group.SmtGroupFilter;
import com.intercom.web.smtcollector.domain.product.SmtProductCode;
import com.intercom.web.smtcollector.domain.variant.SmtVariantFilter;
import com.intercom.web.smtcollector.domain.variant.SmtVariantGtin;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;
import org.apache.cxf.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmtCollectorClient {

	private WebClient client;
	private boolean debug = false;
	private static final String GROUPS_PATH = "/groups";
	private static final String BRAND_TYPES_PATH = "/brand-types";
	private static final String BRANDS_PATH = "/brands";
	private static final String VARIANTS_PATH = "/variants";
	private static final Charset CHARSET = Charset.forName("UTF-8");
	private static final String DATE_FORMAT = "dd/MM/yyyy";
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public SmtCollectorClient(String webServiceBaseUrl, String username, String password) {
		initWebClient(webServiceBaseUrl, username, password);
	}

	public SmtCollectorClient(String webServiceBaseUrl, String username, String password, boolean debug) {
		initWebClient(webServiceBaseUrl, username, password);
		this.debug = debug;
	}

	private void initWebClient(String webServiceBaseUrl, String username, String password) {
		Validate.notNull(webServiceBaseUrl, "The \"webServiceBaseUrl\" parameter can not be null.");
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		client = WebClient.create(webServiceBaseUrl, providers, username, password, null).type(MediaType.APPLICATION_JSON);
		WebClient.getConfig(client).getRequestContext().put(Message.MAINTAIN_SESSION, true);
	}

	public SmtGroupsPagedResponse getGroups(SmtPageable pageable, SmtGroupFilter filter) throws SmtDetailedErrorResponse {
		MultivaluedHashMap parameters = new MultivaluedHashMap<String, String>();
		addPageableParameters(parameters, pageable);
		if(filter != null) {
			if(filter.getLevel() != null) {
				parameters.add("level", filter.getLevel().toString());
			}
			if(filter.getCode() != null) {
				parameters.add("code", filter.getCode().toString());
			}
			if(filter.getParentGroupCode() != null) {
				parameters.add("parentGroupCode", filter.getParentGroupCode().toString());
			}
			if(filter.getCodeStartsWith() != null) {
				parameters.add("codeStartsWith", filter.getCodeStartsWith());
			}
			if(filter.getCodeLike() != null) {
				parameters.add("codeLike", filter.getCodeLike());
			}
			if(filter.getNameStartsWith() != null) {
				parameters.add("nameStartsWith", filter.getNameStartsWith());
			}
			if(filter.getNameLike() != null) {
				parameters.add("nameLike", filter.getNameLike());
			}
		}
		SmtGroupsPagedResponse response = doPost(GROUPS_PATH, SmtGroupsPagedResponse.class, parameters);
		return response;
	}

	public SmtBrandTypesPagedResponse getBrandTypes(SmtPageable pageable, SmtBrandTypeFilter filter) throws SmtDetailedErrorResponse {
		MultivaluedHashMap parameters = new MultivaluedHashMap<String, String>();
		addPageableParameters(parameters, pageable);
		if(filter != null) {
			if(filter.getCode() != null) {
				parameters.add("code", filter.getCode().toString());
			}
			if(filter.getCodeStartsWith() != null) {
				parameters.add("codeStartsWith", filter.getCodeStartsWith());
			}
			if(filter.getCodeLike() != null) {
				parameters.add("codeLike", filter.getCodeLike());
			}
			if(filter.getNameStartsWith() != null) {
				parameters.add("nameStartsWith", filter.getNameStartsWith());
			}
			if(filter.getNameLike() != null) {
				parameters.add("nameLike", filter.getNameLike());
			}
		}
		SmtBrandTypesPagedResponse response = doPost(BRAND_TYPES_PATH, SmtBrandTypesPagedResponse.class, parameters);
		return response;
	}

	public SmtBrandsPagedResponse getBrands(SmtPageable pageable, SmtBrandFilter filter) throws SmtDetailedErrorResponse {
		MultivaluedHashMap parameters = new MultivaluedHashMap<String, String>();
		addPageableParameters(parameters, pageable);
		if(filter != null) {
			if(filter.getCode() != null) {
				parameters.add("code", filter.getCode().toString());
			}
			if(filter.getBrandTypeCode() != null) {
				parameters.add("brandTypeCode", filter.getBrandTypeCode().toString());
			}
			if(filter.getCodeStartsWith() != null) {
				parameters.add("codeStartsWith", filter.getCodeStartsWith());
			}
			if(filter.getCodeLike() != null) {
				parameters.add("codeLike", filter.getCodeLike());
			}
			if(filter.getNameStartsWith() != null) {
				parameters.add("nameStartsWith", filter.getNameStartsWith());
			}
			if(filter.getNameLike() != null) {
				parameters.add("nameLike", filter.getNameLike());
			}
		}
		SmtBrandsPagedResponse response = doPost(BRANDS_PATH, SmtBrandsPagedResponse.class, parameters);
		return response;
	}

	public SmtVariantsPagedResponse getVariants(SmtPageable pageable, SmtVariantFilter filter) throws SmtDetailedErrorResponse {
		MultivaluedHashMap parameters = new MultivaluedHashMap<String, String>();
		addPageableParameters(parameters, pageable);
		if(filter != null) {
			if(filter.getGtin() != null) {
				parameters.add("gtin", filter.getGtin());
			}
			if(filter.getGtins() != null) {
				for(SmtVariantGtin gtin : filter.getGtins()) {
					parameters.add("gtins", gtin.toString());
				}
			}
			if(filter.getGtinLike() != null) {
				parameters.add("gtinLike", filter.getGtinLike());
			}
			if(filter.getLastModifiedDateGreaterThanOrEqualTo() != null) {
				parameters.add("lastModifiedDateGreaterThanOrEqualTo", DateFormatUtils.format(filter.getLastModifiedDateGreaterThanOrEqualTo(), DATE_FORMAT));
			}
			if(filter.getProductCode() != null) {
				parameters.add("productCode", filter.getProductCode());
			}
			if(filter.getProductCodes() != null) {
				for(SmtProductCode productCode : filter.getProductCodes()) {
					parameters.add("productCodes", productCode.toString());
				}
			}
			if(filter.getProductCodeLike() != null) {
				parameters.add("productCodeLike", filter.getProductCodeLike());
			}
			if(filter.getProductTechnicalDescriptionLike() != null) {
				parameters.add("productTechnicalDescriptionLike", filter.getProductTechnicalDescriptionLike());
			}
			if(filter.getProductCompactDescriptionLike() != null) {
				parameters.add("productCompactDescriptionLike", filter.getProductCompactDescriptionLike());
			}
			if(filter.getProductClickAndCollect() != null) {
				parameters.add("productClickAndCollect", filter.getProductClickAndCollect().toString());
			}
			if(filter.getDescriptionLike() != null) {
				parameters.add("descriptionLike", filter.getDescriptionLike());
			}
			if(filter.getSubfamilyGroupCodes() != null) {
				for(SmtGroupCode code : filter.getSubfamilyGroupCodes()) {
					parameters.add("subfamilyGroupCodes", code.toString());
				}
			}
			if(filter.getFamilyGroupCodes() != null) {
				for(SmtGroupCode code : filter.getFamilyGroupCodes()) {
					parameters.add("familyGroupCodes", code.toString());
				}
			}
			if(filter.getGroupGroupCodes() != null) {
				for(SmtGroupCode code : filter.getGroupGroupCodes()) {
					parameters.add("groupGroupCodes", code.toString());
				}
			}
			if(filter.getSectorGroupCodes() != null) {
				for(SmtGroupCode code : filter.getSectorGroupCodes()) {
					parameters.add("sectorGroupCodes", code.toString());
				}
			}
			if(filter.getDepartmentGroupCodes() != null) {
				for(SmtGroupCode code : filter.getDepartmentGroupCodes()) {
					parameters.add("departmentGroupCodes", code.toString());
				}
			}
			if(filter.getBrandTypeCodes() != null) {
				for(SmtBrandTypeCode code : filter.getBrandTypeCodes()) {
					parameters.add("brandTypeCodes", code.toString());
				}
			}
			if(filter.getBrandCodes() != null) {
				for(SmtBrandCode code : filter.getBrandCodes()) {
					parameters.add("brandCodes", code.toString());
				}
			}
			if(filter.getLongTextBrandLike() != null) {
				parameters.add("longTextBrandLike", filter.getLongTextBrandLike());
			}
			if(filter.getLongTextBrandStartsWith() != null) {
				parameters.add("longTextBrandStartsWith", filter.getLongTextBrandStartsWith());
			}
		}
		SmtVariantsPagedResponse response = doPost(VARIANTS_PATH, SmtVariantsPagedResponse.class, parameters);
		return response;
	}

	private void addPageableParameters(MultivaluedHashMap parameters, SmtPageable pageable) {
		if(pageable != null) {
			parameters.add("page", Integer.toString(pageable.getPage()));
			parameters.add("size", Integer.toString(pageable.getSize()));
			parameters.add("sort", pageable.getSort());
		}
	}

	private <T extends SmtResponse> T doGet(String path, Class<T> type, MultivaluedHashMap<String, String> parameters) throws SmtDetailedErrorResponse {
		Validate.notNull(path, "The \"path\" parameter can not be null.");
		Validate.notNull(type, "The \"type\" parameter can not be null.");
		client.reset();
		client.path(path);
		if(parameters != null) {
			for(MultivaluedHashMap.Entry<String, List<String>> parameter : parameters.entrySet()) {
				client.query(parameter.getKey(), parameter.getValue());
			}
		}
		if(debug) {
			logRequest(parameters);
		}
		return readEntity(client.get(), type);
	}

	private <T extends SmtResponse> T doPost(String path, Class<T> type, MultivaluedHashMap<String, String> parameters) throws SmtDetailedErrorResponse {
		Validate.notNull(path, "The \"path\" parameter can not be null.");
		Validate.notNull(type, "The \"type\" parameter can not be null.");
		List<Attachment> attachments = new ArrayList<Attachment>();
		if(parameters != null) {
			for(MultivaluedHashMap.Entry<String, List<String>> parameter : parameters.entrySet()) {
				ContentDisposition contentDisposition = new ContentDisposition(String.format("form-data; name=\"%s\";", parameter.getKey()));
				for(String value : parameter.getValue()) {
					Attachment attachment = new Attachment(parameter.getKey(), new ByteArrayInputStream(value.getBytes(CHARSET)), contentDisposition);
					attachments.add(attachment);
				}
			}
		}
		MultipartBody multipartBody = new MultipartBody(attachments);
		client.reset();
		client.type(MediaType.MULTIPART_FORM_DATA_TYPE);
		client.path(path);
		if(debug) {
			logRequest(parameters);
		}
		return readEntity(client.post(multipartBody), type);
	}

	private <T extends SmtResponse> T doPost(String path, Class<T> type, InputStream fileInputStream, String fileName, MultivaluedHashMap<String, String> parameters) throws IOException, SmtDetailedErrorResponse {
		Validate.notNull(path, "The \"path\" parameter can not be null.");
		Validate.notNull(type, "The \"type\" parameter can not be null.");
		List<Attachment> attachments = new ArrayList<Attachment>();
		if(fileInputStream != null) {
			ContentDisposition contentDisposition = new ContentDisposition(String.format("form-data; name=\"%s\"; filename=\"%s\";", "Filedata", fileName));
			Attachment attachment = new Attachment("Filedata", fileInputStream, contentDisposition);
			attachments.add(attachment);
		}
		if(parameters != null) {
			for(MultivaluedHashMap.Entry<String, List<String>> parameter : parameters.entrySet()) {
				ContentDisposition contentDisposition = new ContentDisposition(String.format("form-data; name=\"%s\";", parameter.getKey()));
				for(String value : parameter.getValue()) {
					Attachment attachment = new Attachment(parameter.getKey(), new ByteArrayInputStream(value.getBytes(CHARSET)), contentDisposition);
					attachments.add(attachment);
				}
			}
		}
		MultipartBody multipartBody = new MultipartBody(attachments);
		client.reset();
		client.type(MediaType.MULTIPART_FORM_DATA_TYPE);
		client.path(path);
		if(debug) {
			logRequest(parameters);
		}
		return readEntity(client.post(multipartBody), type);
	}

	private <T extends SmtResponse> T readEntity(Response response, Class<T> type) throws SmtDetailedErrorResponse {
		Response.StatusType status = response.getStatusInfo();
		try {
			if(status.getStatusCode() == Response.Status.OK.getStatusCode()) {
				return response.readEntity(type);
			} else {
				SmtDetailedErrorResponse errorResponse;
				try {
					response.bufferEntity();
					errorResponse = response.readEntity(SmtDetailedErrorResponse.class);
					if(errorResponse != null) {
						errorResponse.setJson(response.readEntity(String.class));
						throw errorResponse;
					} else {
						throw new SmtGenericErrorResponse(status);
					}
				} catch(ProcessingException e) {
					StrBuilder exceptionBuilder = new StrBuilder();
					exceptionBuilder.appendln("Server returned an unrecognized error response (status code %s)", status.getStatusCode());
					exceptionBuilder.appendln(response.readEntity(String.class));
					throw new RuntimeException(exceptionBuilder.toString(), e);
				}
			}
		} finally {
			response.close();
		}
	}

	private void logRequest(MultivaluedHashMap<String, String> parameters) {
		StrBuilder logBuilder = new StrBuilder();
		logBuilder.appendln("ElvisRestClient uri: ");
		logBuilder.appendln(client.getCurrentURI());
		logBuilder.appendln("ElvisRestClient headers: ");
		for(MultivaluedHashMap.Entry<String, List<String>> entry : client.getHeaders().entrySet()) {
			logBuilder.appendln(entry.getKey() + ": " + StringUtils.join(entry.getValue(), ","));
		}
		logBuilder.appendln("ElvisRestClient parameters: ");
		if(parameters != null) {
			for(MultivaluedHashMap.Entry<String, List<String>> entry : parameters.entrySet()) {
				logBuilder.appendln(entry.getKey() + ": " + StringUtils.join(entry.getValue(), ","));
			}
		}
		logger.info(logBuilder.toString());
	}

}
