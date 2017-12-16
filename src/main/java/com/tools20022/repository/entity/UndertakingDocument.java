/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ExternalDocumentFormatCode;
import com.tools20022.repository.codeset.ExternalUndertakingDocumentTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document presented.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingDocument" src="doc-files/UndertakingDocument.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDocumentType
 * UndertakingDocument.mmDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmFormat
 * UndertakingDocument.mmFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmUndertaking
 * UndertakingDocument.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmCopyIndicator
 * UndertakingDocument.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDemand
 * UndertakingDocument.mmDemand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
 * Undertaking.mmSpecifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmAssociatedDocument
 * Demand.mmAssociatedDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingDocument"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Document presented."</li>
 * </ul>
 */
public class UndertakingDocument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExternalUndertakingDocumentTypeCode documentType;
	/**
	 * Type of document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingDocumentTypeCode
	 * ExternalUndertakingDocumentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDocumentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentType";
			definition = "Type of document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingDocumentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingDocument.class.getMethod("getDocumentType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalDocumentFormatCode format;
	/**
	 * Format of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentFormatCode
	 * ExternalDocumentFormatCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFormat = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Format";
			definition = "Format of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentFormatCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingDocument.class.getMethod("getFormat", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Undertaking undertaking;
	/**
	 * Undertaking for which document content is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
	 * Undertaking.mmSpecifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which document content is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which document content is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmSpecifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected YesNoIndicator copyIndicator;
	/**
	 * Indicates whether the document is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the document is a copy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCopyIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the document is a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingDocument.class.getMethod("getCopyIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Demand demand;
	/**
	 * Demand for which associated documents are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmAssociatedDocument
	 * Demand.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Demand for which associated documents are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDemand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Demand for which associated documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingDocument";
				definition = "Document presented.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmSpecifiedDocument, com.tools20022.repository.entity.Demand.mmAssociatedDocument);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingDocument.mmDocumentType, com.tools20022.repository.entity.UndertakingDocument.mmFormat,
						com.tools20022.repository.entity.UndertakingDocument.mmUndertaking, com.tools20022.repository.entity.UndertakingDocument.mmCopyIndicator, com.tools20022.repository.entity.UndertakingDocument.mmDemand);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingDocument.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalUndertakingDocumentTypeCode getDocumentType() {
		return documentType;
	}

	public void setDocumentType(ExternalUndertakingDocumentTypeCode documentType) {
		this.documentType = documentType;
	}

	public ExternalDocumentFormatCode getFormat() {
		return format;
	}

	public void setFormat(ExternalDocumentFormatCode format) {
		this.format = format;
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public YesNoIndicator getCopyIndicator() {
		return copyIndicator;
	}

	public void setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
	}

	public Demand getDemand() {
		return demand;
	}

	public void setDemand(com.tools20022.repository.entity.Demand demand) {
		this.demand = demand;
	}
}