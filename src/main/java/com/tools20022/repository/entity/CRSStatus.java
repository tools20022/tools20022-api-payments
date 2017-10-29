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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CRSSourceStatusCode;
import com.tools20022.repository.codeset.CRSStatusCode;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Common Reporting Standard (CRS) status and the status source of the investor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CRSStatus" src="doc-files/CRSStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CRSStatus#CRSStatus
 * CRSStatus.CRSStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#ExceptionalReportingCountry
 * CRSStatus.ExceptionalReportingCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CRSStatus#CRSSourceStatus
 * CRSStatus.CRSSourceStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CRSStatus#CRSReportingDate
 * CRSStatus.CRSReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#InvestmentAccountParty
 * CRSStatus.InvestmentAccountParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#CRSStatus
 * InvestmentAccountPartyRole.CRSStatus}</li>
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
 * "CRSStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Common Reporting Standard (CRS) status and the status source of the investor."
 * </li>
 * </ul>
 */
public class CRSStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Common Reporting Standard (CRS) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode
	 * CRSStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Reporting Standard (CRS) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CRSStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CRSStatusCode.mmObject();
		}
	};
	/**
	 * Reporting country for the CRS status when there is an exception at the
	 * country level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalReportingCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting country for the CRS status when there is an exception at the country level."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExceptionalReportingCountry = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalReportingCountry";
			definition = "Reporting country for the CRS status when there is an exception at the country level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Source of the Common Reporting Standard (CRS) status expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CRSSourceStatusCode
	 * CRSSourceStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSSourceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Common Reporting Standard (CRS) status expressed as a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CRSSourceStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSSourceStatus";
			definition = "Source of the Common Reporting Standard (CRS) status expressed as a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CRSSourceStatusCode.mmObject();
		}
	};
	/**
	 * Date provided by the account owner to inform the account servicer of the
	 * date on which the holdings must be reported before the account is
	 * subsequently closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CRSReportingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Common Reporting Standard (CRS) status linked to an investment account
	 * and played by a party in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#CRSStatus
	 * InvestmentAccountPartyRole.CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CRSStatus
	 * CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common Reporting Standard (CRS) status linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Common Reporting Standard (CRS) status linked to an investment account and played by a party in that context.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.CRSStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSStatus";
				definition = "Common Reporting Standard (CRS) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.CRSStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CRSStatus.CRSStatus, com.tools20022.repository.entity.CRSStatus.ExceptionalReportingCountry, com.tools20022.repository.entity.CRSStatus.CRSSourceStatus,
						com.tools20022.repository.entity.CRSStatus.CRSReportingDate, com.tools20022.repository.entity.CRSStatus.InvestmentAccountParty);
			}
		});
		return mmObject_lazy.get();
	}
}