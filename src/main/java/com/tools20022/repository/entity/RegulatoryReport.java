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
import com.tools20022.repository.codeset.RegulatoryReportingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RegulatoryReporting3;
import com.tools20022.repository.msg.StructuredRegulatoryReporting3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmDebitCreditReportingIndicator
 * RegulatoryReport.mmDebitCreditReportingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmAuthority
 * RegulatoryReport.mmAuthority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#mmCode
 * RegulatoryReport.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#mmAmount
 * RegulatoryReport.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmDescription
 * RegulatoryReport.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#mmType
 * RegulatoryReport.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReport#mmDate
 * RegulatoryReport.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmReportedTransaction
 * RegulatoryReport.mmReportedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmUnderlyingProduct
 * RegulatoryReport.mmUnderlyingProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmNonStandardFlag
 * RegulatoryReport.mmNonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmReportingPartyRole
 * RegulatoryReport.mmReportingPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmRegulatoryReport
 * RegulatoryAuthorityRole.mmRegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingPartyRole#mmRegulatoryReport
 * ReportingPartyRole.mmRegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
 * FinancialTransaction.mmRegulatoryReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmDetails
 * RegulatoryReporting3.mmDetails}</li>
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
	protected RegulatoryReportingTypeCode debitCreditReportingIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmDebitCreditReportingIndicator
	 * RegulatoryReporting3.mmDebitCreditReportingIndicator}</li>
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
	public static final MMBusinessAttribute mmDebitCreditReportingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting3.mmDebitCreditReportingIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCreditReportingIndicator";
			definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegulatoryReportingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getDebitCreditReportingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.RegulatoryAuthorityRole> authority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmRegulatoryReport
	 * RegulatoryAuthorityRole.mmRegulatoryReport}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting3#mmAuthority
	 * RegulatoryReporting3.mmAuthority}</li>
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
	public static final MMBusinessAssociationEnd mmAuthority = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting3.mmAuthority);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authority";
			definition = "Entity requiring the regulatory reporting information.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmRegulatoryReport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmObject();
		}
	};
	protected Max10Text code;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmCode
	 * StructuredRegulatoryReporting3.mmCode}</li>
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
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the nature, purpose, and reason for the transaction to be reported for regulatory and statutory requirements in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmAmount
	 * StructuredRegulatoryReporting3.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money to be reported for regulatory and statutory requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text description;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmInformation
	 * StructuredRegulatoryReporting3.mmInformation}</li>
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
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Additional details that may be necessary to cater for specific domestic regulatory requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmType
	 * StructuredRegulatoryReporting3.mmType}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the information supplied in the regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate date;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmDate
	 * StructuredRegulatoryReporting3.mmDate}</li>
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
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date related to the specified type of regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialTransaction reportedTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
	 * FinancialTransaction.mmRegulatoryReport}</li>
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
	public static final MMBusinessAssociationEnd mmReportedTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedTransaction";
			definition = "Trade for which a regulatory report is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmRegulatoryReport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	protected Max35Text underlyingProduct;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmUnderlyingProduct = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getUnderlyingProduct", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator nonStandardFlag;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmNonStandardFlag = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryReport.class.getMethod("getNonStandardFlag", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ReportingPartyRole> reportingPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingPartyRole#mmRegulatoryReport
	 * ReportingPartyRole.mmRegulatoryReport}</li>
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
	public static final MMBusinessAssociationEnd mmReportingPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingPartyRole";
			definition = "Party responsible for providing regulatory reports.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.mmRegulatoryReport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReport";
				definition = "Information needed due to regulatory and statutory requirements.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryAuthorityRole.mmRegulatoryReport, com.tools20022.repository.entity.ReportingPartyRole.mmRegulatoryReport,
						com.tools20022.repository.entity.FinancialTransaction.mmRegulatoryReport);
				derivationElement_lazy = () -> Arrays.asList(RegulatoryReporting3.mmDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReport.mmDebitCreditReportingIndicator, com.tools20022.repository.entity.RegulatoryReport.mmAuthority,
						com.tools20022.repository.entity.RegulatoryReport.mmCode, com.tools20022.repository.entity.RegulatoryReport.mmAmount, com.tools20022.repository.entity.RegulatoryReport.mmDescription,
						com.tools20022.repository.entity.RegulatoryReport.mmType, com.tools20022.repository.entity.RegulatoryReport.mmDate, com.tools20022.repository.entity.RegulatoryReport.mmReportedTransaction,
						com.tools20022.repository.entity.RegulatoryReport.mmUnderlyingProduct, com.tools20022.repository.entity.RegulatoryReport.mmNonStandardFlag, com.tools20022.repository.entity.RegulatoryReport.mmReportingPartyRole);
				derivationComponent_lazy = () -> Arrays.asList(StructuredRegulatoryReporting3.mmObject(), RegulatoryReporting3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryReport.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RegulatoryReportingTypeCode getDebitCreditReportingIndicator() {
		return debitCreditReportingIndicator;
	}

	public RegulatoryReport setDebitCreditReportingIndicator(RegulatoryReportingTypeCode debitCreditReportingIndicator) {
		this.debitCreditReportingIndicator = Objects.requireNonNull(debitCreditReportingIndicator);
		return this;
	}

	public List<RegulatoryAuthorityRole> getAuthority() {
		return authority == null ? authority = new ArrayList<>() : authority;
	}

	public RegulatoryReport setAuthority(List<com.tools20022.repository.entity.RegulatoryAuthorityRole> authority) {
		this.authority = Objects.requireNonNull(authority);
		return this;
	}

	public Max10Text getCode() {
		return code;
	}

	public RegulatoryReport setCode(Max10Text code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public RegulatoryReport setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Max35Text getDescription() {
		return description;
	}

	public RegulatoryReport setDescription(Max35Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Max35Text getType() {
		return type;
	}

	public RegulatoryReport setType(Max35Text type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODate getDate() {
		return date;
	}

	public RegulatoryReport setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public FinancialTransaction getReportedTransaction() {
		return reportedTransaction;
	}

	public RegulatoryReport setReportedTransaction(com.tools20022.repository.entity.FinancialTransaction reportedTransaction) {
		this.reportedTransaction = Objects.requireNonNull(reportedTransaction);
		return this;
	}

	public Max35Text getUnderlyingProduct() {
		return underlyingProduct;
	}

	public RegulatoryReport setUnderlyingProduct(Max35Text underlyingProduct) {
		this.underlyingProduct = Objects.requireNonNull(underlyingProduct);
		return this;
	}

	public YesNoIndicator getNonStandardFlag() {
		return nonStandardFlag;
	}

	public RegulatoryReport setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = Objects.requireNonNull(nonStandardFlag);
		return this;
	}

	public List<ReportingPartyRole> getReportingPartyRole() {
		return reportingPartyRole == null ? reportingPartyRole = new ArrayList<>() : reportingPartyRole;
	}

	public RegulatoryReport setReportingPartyRole(List<com.tools20022.repository.entity.ReportingPartyRole> reportingPartyRole) {
		this.reportingPartyRole = Objects.requireNonNull(reportingPartyRole);
		return this;
	}
}