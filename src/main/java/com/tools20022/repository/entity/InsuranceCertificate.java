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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.InsuranceClausesCode;
import com.tools20022.repository.codeset.InsuranceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Formal document used to record a fact and used as proof of the fact that
 * goods have been insured under an insurance policy.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InsuranceCertificate" src="doc-files/InsuranceCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmEffectiveDate
 * InsuranceCertificate.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuredAmount
 * InsuranceCertificate.mmInsuredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceConditions
 * InsuranceCertificate.mmInsuranceConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceClauses
 * InsuranceCertificate.mmInsuranceClauses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableAt
 * InsuranceCertificate.mmClaimsPayableAt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableIn
 * InsuranceCertificate.mmClaimsPayableIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsurancePartyRole
 * InsuranceCertificate.mmInsurancePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmProductDelivery
 * InsuranceCertificate.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceType
 * InsuranceCertificate.mmInsuranceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmRelatedInvestmentPlan
 * InsuranceCertificate.mmRelatedInvestmentPlan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmInsuranceCertificate
 * Location.mmInsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInsurance
 * InvestmentPlan.mmInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmInsuranceCertificate
 * ProductDelivery.mmInsuranceCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsurancePartyRole#mmInsuranceCertificate
 * InsurancePartyRole.mmInsuranceCertificate}</li>
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
 * "InsuranceCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy."
 * </li>
 * </ul>
 */
public class InsuranceCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate effectiveDate;
	/**
	 * Date upon which cover under an insurance policy becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which cover under an insurance policy becomes effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date upon which cover under an insurance policy becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount insuredAmount;
	/**
	 * Value of the goods as insured under the insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the goods as insured under the insurance policy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsuredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuredAmount";
			definition = "Value of the goods as insured under the insurance policy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getInsuredAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text insuranceConditions;
	/**
	 * Description of the conditions and exclusion clauses under which insurance
	 * is granted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the conditions and exclusion clauses under which insurance is granted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsuranceConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceConditions";
			definition = "Description of the conditions and exclusion clauses under which insurance is granted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getInsuranceConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InsuranceClausesCode insuranceClauses;
	/**
	 * Standard insurance clauses defined by the Institute of London
	 * Underwriters (or the American Institute of marine Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceClauses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsuranceClauses = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceClauses";
			definition = "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InsuranceClausesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getInsuranceClauses", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Location claimsPayableAt;
	/**
	 * Place where claims under the insurance policy will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmInsuranceCertificate
	 * Location.mmInsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimsPayableAt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where claims under the insurance policy will be paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClaimsPayableAt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableAt";
			definition = "Place where claims under the insurance policy will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmInsuranceCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected CurrencyCode claimsPayableIn;
	/**
	 * Currency in which claims, if valid, will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimsPayableIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which claims, if valid, will be paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClaimsPayableIn = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableIn";
			definition = "Currency in which claims, if valid, will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getClaimsPayableIn", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InsurancePartyRole> insurancePartyRole;
	/**
	 * Role played by a party in the context of insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsurancePartyRole#mmInsuranceCertificate
	 * InsurancePartyRole.mmInsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InsurancePartyRole
	 * InsurancePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of insurance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInsurancePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePartyRole";
			definition = "Role played by a party in the context of insurance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.mmInsuranceCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.mmObject();
		}
	};
	protected ProductDelivery productDelivery;
	/**
	 * Delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmInsuranceCertificate
	 * ProductDelivery.mmInsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery parameters of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmInsuranceCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected InsuranceCode insuranceType;
	/**
	 * Specifies the type of insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceCode
	 * InsuranceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of insurance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInsuranceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceType";
			definition = "Specifies the type of insurance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InsuranceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InsuranceCertificate.class.getMethod("getInsuranceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan relatedInvestmentPlan;
	/**
	 * Investment plan covered by an insurance contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInsurance
	 * InvestmentPlan.mmInsurance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan covered by an insurance contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "Investment plan covered by an insurance contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmInsurance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InsuranceCertificate";
				definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.mmInsuranceCertificate, com.tools20022.repository.entity.InvestmentPlan.mmInsurance,
						com.tools20022.repository.entity.ProductDelivery.mmInsuranceCertificate, com.tools20022.repository.entity.InsurancePartyRole.mmInsuranceCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InsuranceCertificate.mmEffectiveDate, com.tools20022.repository.entity.InsuranceCertificate.mmInsuredAmount,
						com.tools20022.repository.entity.InsuranceCertificate.mmInsuranceConditions, com.tools20022.repository.entity.InsuranceCertificate.mmInsuranceClauses,
						com.tools20022.repository.entity.InsuranceCertificate.mmClaimsPayableAt, com.tools20022.repository.entity.InsuranceCertificate.mmClaimsPayableIn,
						com.tools20022.repository.entity.InsuranceCertificate.mmInsurancePartyRole, com.tools20022.repository.entity.InsuranceCertificate.mmProductDelivery,
						com.tools20022.repository.entity.InsuranceCertificate.mmInsuranceType, com.tools20022.repository.entity.InsuranceCertificate.mmRelatedInvestmentPlan);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InsuranceCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public CurrencyAndAmount getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(CurrencyAndAmount insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public Max350Text getInsuranceConditions() {
		return insuranceConditions;
	}

	public void setInsuranceConditions(Max350Text insuranceConditions) {
		this.insuranceConditions = insuranceConditions;
	}

	public InsuranceClausesCode getInsuranceClauses() {
		return insuranceClauses;
	}

	public void setInsuranceClauses(InsuranceClausesCode insuranceClauses) {
		this.insuranceClauses = insuranceClauses;
	}

	public Location getClaimsPayableAt() {
		return claimsPayableAt;
	}

	public void setClaimsPayableAt(com.tools20022.repository.entity.Location claimsPayableAt) {
		this.claimsPayableAt = claimsPayableAt;
	}

	public CurrencyCode getClaimsPayableIn() {
		return claimsPayableIn;
	}

	public void setClaimsPayableIn(CurrencyCode claimsPayableIn) {
		this.claimsPayableIn = claimsPayableIn;
	}

	public List<InsurancePartyRole> getInsurancePartyRole() {
		return insurancePartyRole;
	}

	public void setInsurancePartyRole(List<com.tools20022.repository.entity.InsurancePartyRole> insurancePartyRole) {
		this.insurancePartyRole = insurancePartyRole;
	}

	public ProductDelivery getProductDelivery() {
		return productDelivery;
	}

	public void setProductDelivery(com.tools20022.repository.entity.ProductDelivery productDelivery) {
		this.productDelivery = productDelivery;
	}

	public InsuranceCode getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceCode insuranceType) {
		this.insuranceType = insuranceType;
	}

	public InvestmentPlan getRelatedInvestmentPlan() {
		return relatedInvestmentPlan;
	}

	public void setRelatedInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan relatedInvestmentPlan) {
		this.relatedInvestmentPlan = relatedInvestmentPlan;
	}
}