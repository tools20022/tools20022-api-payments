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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.InsuranceClausesCode;
import com.tools20022.repository.codeset.InsuranceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#EffectiveDate
 * InsuranceCertificate.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#InsuredAmount
 * InsuranceCertificate.InsuredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#InsuranceConditions
 * InsuranceCertificate.InsuranceConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#InsuranceClauses
 * InsuranceCertificate.InsuranceClauses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ClaimsPayableAt
 * InsuranceCertificate.ClaimsPayableAt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ClaimsPayableIn
 * InsuranceCertificate.ClaimsPayableIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#InsurancePartyRole
 * InsuranceCertificate.InsurancePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#ProductDelivery
 * InsuranceCertificate.ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#InsuranceType
 * InsuranceCertificate.InsuranceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#RelatedInvestmentPlan
 * InsuranceCertificate.RelatedInvestmentPlan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#InsuranceCertificate
 * Location.InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Insurance
 * InvestmentPlan.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#InsuranceCertificate
 * ProductDelivery.InsuranceCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsurancePartyRole#InsuranceCertificate
 * InsurancePartyRole.InsuranceCertificate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "InsuranceCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy."
 * </li>
 * </ul>
 */
public class InsuranceCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date upon which cover under an insurance policy becomes effective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute InsuredAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuredAmount";
			definition = "Value of the goods as insured under the insurance policy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute InsuranceConditions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceConditions";
			definition = "Description of the conditions and exclusion clauses under which insurance is granted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute InsuranceClauses = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceClauses";
			definition = "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InsuranceClausesCode.mmObject();
		}
	};
	/**
	 * Place where claims under the insurance policy will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#InsuranceCertificate
	 * Location.InsuranceCertificate}</li>
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
	public static final MMBusinessAssociationEnd ClaimsPayableAt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableAt";
			definition = "Place where claims under the insurance policy will be paid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ClaimsPayableIn = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimsPayableIn";
			definition = "Currency in which claims, if valid, will be paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsurancePartyRole#InsuranceCertificate
	 * InsurancePartyRole.InsuranceCertificate}</li>
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
	public static final MMBusinessAssociationEnd InsurancePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePartyRole";
			definition = "Role played by a party in the context of insurance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InsurancePartyRole.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#InsuranceCertificate
	 * ProductDelivery.InsuranceCertificate}</li>
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
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery parameters of a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute InsuranceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceType";
			definition = "Specifies the type of insurance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InsuranceCode.mmObject();
		}
	};
	/**
	 * Investment plan covered by an insurance contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Insurance
	 * InvestmentPlan.Insurance}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InsuranceCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "Investment plan covered by an insurance contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Insurance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InsuranceCertificate";
				definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.InsuranceCertificate, com.tools20022.repository.entity.InvestmentPlan.Insurance,
						com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate, com.tools20022.repository.entity.InsurancePartyRole.InsuranceCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.InsuranceCertificate.EffectiveDate, com.tools20022.repository.entity.InsuranceCertificate.InsuredAmount,
								com.tools20022.repository.entity.InsuranceCertificate.InsuranceConditions, com.tools20022.repository.entity.InsuranceCertificate.InsuranceClauses,
								com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt, com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableIn,
								com.tools20022.repository.entity.InsuranceCertificate.InsurancePartyRole, com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery,
								com.tools20022.repository.entity.InsuranceCertificate.InsuranceType, com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan);
			}
		});
		return mmObject_lazy.get();
	}
}