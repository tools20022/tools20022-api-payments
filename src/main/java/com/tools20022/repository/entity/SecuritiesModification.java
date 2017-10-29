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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#ChangeType
 * SecuritiesModification.ChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewOrganisationInformation
 * SecuritiesModification.NewOrganisationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
 * SecuritiesModification.RelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NewSecurityReferenceData
 * SecuritiesModification.NewSecurityReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#NumberOfSharesIssued
 * SecuritiesModification.NumberOfSharesIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#LastTradingDate
 * SecuritiesModification.LastTradingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Modification
 * Security.Modification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
 * Organisation.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
 * CorporateActionEvent.SecuritiesModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMBusinessAttribute ChangeType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeType";
			definition = "Type of changes affecting the security form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionChangeTypeCode.mmObject();
		}
	};
	/**
	 * New name of a company following a name change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#SecuritiesModification
	 * Organisation.SecuritiesModification}</li>
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
	public static final MMBusinessAssociationEnd NewOrganisationInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewOrganisationInformation";
			definition = "New name of a company following a name change.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the parameters of the event related to the modification of the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
	 * CorporateActionEvent.SecuritiesModification}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Specifies the parameters of the event related to the modification of the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the updated information of the new security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Modification
	 * Security.Modification}</li>
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
	public static final MMBusinessAssociationEnd NewSecurityReferenceData = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecurityReferenceData";
			definition = "Specifies the updated information of the new security.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Modification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute NumberOfSharesIssued = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfSharesIssued";
			definition = "The number of shares the issuer is creating as part of the event";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesModification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesModification";
				definition = "Modification of the reference data of a security or of the organisation that issued it.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Organisation.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesModification.ChangeType, com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData,
						com.tools20022.repository.entity.SecuritiesModification.NumberOfSharesIssued, com.tools20022.repository.entity.SecuritiesModification.LastTradingDate);
			}
		});
		return mmObject_lazy.get();
	}
}