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
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification of the reference data of a security or of the organisation that
 * issued it.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesModification"
 * src="doc-files/SecuritiesModification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
 * SecuritiesModification.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
 * SecuritiesModification.mmNewOrganisationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
 * SecuritiesModification.mmRelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
 * SecuritiesModification.mmNewSecurityReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNumberOfSharesIssued
 * SecuritiesModification.mmNumberOfSharesIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmLastTradingDate
 * SecuritiesModification.mmLastTradingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmModification
 * Security.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
 * Organisation.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
 * CorporateActionEvent.mmSecuritiesModification}</li>
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
 * "SecuritiesModification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification of the reference data of a security or of the organisation that issued it."
 * </li>
 * </ul>
 */
public class SecuritiesModification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionChangeTypeCode changeType;
	/**
	 * Type of changes affecting the security form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of changes affecting the security form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChangeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeType";
			definition = "Type of changes affecting the security form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionChangeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesModification.class.getMethod("getChangeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Organisation newOrganisationInformation;
	/**
	 * New name of a company following a name change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
	 * Organisation.mmSecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewOrganisationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New name of a company following a name change."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewOrganisationInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewOrganisationInformation";
			definition = "New name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmSecuritiesModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * Specifies the parameters of the event related to the modification of the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
	 * CorporateActionEvent.mmSecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of the event related to the modification of the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Specifies the parameters of the event related to the modification of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected Security newSecurityReferenceData;
	/**
	 * Specifies the updated information of the new security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmModification
	 * Security.mmModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecurityReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the updated information of the new security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewSecurityReferenceData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewSecurityReferenceData";
			definition = "Specifies the updated information of the new security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected Number numberOfSharesIssued;
	/**
	 * The number of shares the issuer is creating as part of the event
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSharesIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of shares the issuer is creating as part of the event"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfSharesIssued = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfSharesIssued";
			definition = "The number of shares the issuer is creating as part of the event";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesModification.class.getMethod("getNumberOfSharesIssued", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime lastTradingDate;
	/**
	 * Date/time at which the securities to be reorganised will cease to be
	 * tradeable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities to be reorganised will cease to be tradeable."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLastTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesModification.class.getMethod("getLastTradingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesModification";
				definition = "Modification of the reference data of a security or of the organisation that issued it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmModification, com.tools20022.repository.entity.Organisation.mmSecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesModification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesModification.mmChangeType, com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation,
						com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent, com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData,
						com.tools20022.repository.entity.SecuritiesModification.mmNumberOfSharesIssued, com.tools20022.repository.entity.SecuritiesModification.mmLastTradingDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesModification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionChangeTypeCode getChangeType() {
		return changeType;
	}

	public void setChangeType(CorporateActionChangeTypeCode changeType) {
		this.changeType = changeType;
	}

	public Organisation getNewOrganisationInformation() {
		return newOrganisationInformation;
	}

	public void setNewOrganisationInformation(com.tools20022.repository.entity.Organisation newOrganisationInformation) {
		this.newOrganisationInformation = newOrganisationInformation;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
	}

	public Security getNewSecurityReferenceData() {
		return newSecurityReferenceData;
	}

	public void setNewSecurityReferenceData(com.tools20022.repository.entity.Security newSecurityReferenceData) {
		this.newSecurityReferenceData = newSecurityReferenceData;
	}

	public Number getNumberOfSharesIssued() {
		return numberOfSharesIssued;
	}

	public void setNumberOfSharesIssued(Number numberOfSharesIssued) {
		this.numberOfSharesIssued = numberOfSharesIssued;
	}

	public ISODateTime getLastTradingDate() {
		return lastTradingDate;
	}

	public void setLastTradingDate(ISODateTime lastTradingDate) {
		this.lastTradingDate = lastTradingDate;
	}
}