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
import com.tools20022.repository.codeset.RegulatoryReportingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.RegulatoryReporting3;
import com.tools20022.repository.msg.StructuredRegulatoryReporting3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed due to regulatory and statutory requirements.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegulatoryReport" src="doc-files/RegulatoryReport.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#DebitCreditReportingIndicator
 * RegulatoryReport.DebitCreditReportingIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#Authority
 * RegulatoryReport.Authority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#Code
 * RegulatoryReport.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#Amount
 * RegulatoryReport.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#Description
 * RegulatoryReport.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#Type
 * RegulatoryReport.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#Date
 * RegulatoryReport.Date}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#ReportedTransaction
 * RegulatoryReport.ReportedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#UnderlyingProduct
 * RegulatoryReport.UnderlyingProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#NonStandardFlag
 * RegulatoryReport.NonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#ReportingPartyRole
 * RegulatoryReport.ReportingPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#RegulatoryReport
 * RegulatoryAuthorityRole.RegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingPartyRole#RegulatoryReport
 * ReportingPartyRole.RegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#RegulatoryReport
 * FinancialTransaction.RegulatoryReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting3#Details
 * RegulatoryReporting3.Details}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3
 * StructuredRegulatoryReporting3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting3
 * RegulatoryReporting3}</li>
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
 * "RegulatoryReport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed due to regulatory and statutory requirements."</li>
 * </ul>
 */
public class RegulatoryReport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies whether the regulatory reporting information applies to the
	 * debit side, to the credit side or to both debit and credit sides of the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryReportingTypeCode
	 * RegulatoryReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#DebitCreditReportingIndicator
	 * RegulatoryReporting3.DebitCreditReportingIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditReportingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebitCreditReportingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.DebitCreditReportingIndicator);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RegulatoryReportingTypeCode.mmObject();
		}
	};
	/**
	 * Entity requiring the regulatory reporting information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#RegulatoryReport
	 * RegulatoryAuthorityRole.RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#Authority
	 * RegulatoryReporting3.Authority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity requiring the regulatory reporting information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Authority = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.Authority);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			minOccurs = 1;
			type_lazy = () -> RegulatoryAuthorityRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the nature, purpose, and reason for the transaction to be
	 * reported for regulatory and statutory requirements in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Code
	 * StructuredRegulatoryReporting3.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature, purpose, and reason for the transaction to be reported for regulatory and statutory requirements in a coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Code);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the nature, purpose, and reason for the transaction to be reported for regulatory and statutory requirements in a coded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	/**
	 * Amount of money to be reported for regulatory and statutory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Amount
	 * StructuredRegulatoryReporting3.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be reported for regulatory and statutory requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Amount);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money to be reported for regulatory and statutory requirements.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Additional details that may be necessary to cater for specific domestic
	 * regulatory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Information
	 * StructuredRegulatoryReporting3.Information}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional details that may be necessary to cater for specific domestic regulatory requirements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Information);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Additional details that may be necessary to cater for specific domestic regulatory requirements.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of the information supplied in the regulatory
	 * reporting details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Type
	 * StructuredRegulatoryReporting3.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the information supplied in the regulatory reporting details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Type);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the information supplied in the regulatory reporting details.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date related to the specified type of regulatory reporting details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#Date
	 * StructuredRegulatoryReporting3.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date related to the specified type of regulatory reporting details."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Date);
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date related to the specified type of regulatory reporting details.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Trade for which a regulatory report is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#RegulatoryReport
	 * FinancialTransaction.RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a regulatory report is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportedTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedTransaction";
			definition = "Trade for which a regulatory report is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancialTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the underlying product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnderlyingProduct = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingProduct";
			definition = "Specifies the underlying product type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies whether the reportable transaction has one or more additional
	 * terms or provisions, other than those listed in the required real-time
	 * data fields, that materially affects the price of the reportable
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonStandardFlag = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Party responsible for providing regulatory reports.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingPartyRole#RegulatoryReport
	 * ReportingPartyRole.RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ReportingPartyRole
	 * ReportingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party responsible for providing regulatory reports."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportingPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RegulatoryReport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingPartyRole";
			definition = "Party responsible for providing regulatory reports.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.RegulatoryReport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReport";
				definition = "Information needed due to regulatory and statutory requirements.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryAuthorityRole.RegulatoryReport, com.tools20022.repository.entity.ReportingPartyRole.RegulatoryReport,
						com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting3.Details);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReport.DebitCreditReportingIndicator, com.tools20022.repository.entity.RegulatoryReport.Authority,
						com.tools20022.repository.entity.RegulatoryReport.Code, com.tools20022.repository.entity.RegulatoryReport.Amount, com.tools20022.repository.entity.RegulatoryReport.Description,
						com.tools20022.repository.entity.RegulatoryReport.Type, com.tools20022.repository.entity.RegulatoryReport.Date, com.tools20022.repository.entity.RegulatoryReport.ReportedTransaction,
						com.tools20022.repository.entity.RegulatoryReport.UnderlyingProduct, com.tools20022.repository.entity.RegulatoryReport.NonStandardFlag, com.tools20022.repository.entity.RegulatoryReport.ReportingPartyRole);
				derivationComponent_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmObject(), RegulatoryReporting3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}