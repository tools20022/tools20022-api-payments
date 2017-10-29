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
import com.tools20022.repository.codeset.GlobalNoteCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Preparation/bringing to market of a security (also known as primary market or
 * Initial Public Offering (IPO) issuance).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Issuance" src="doc-files/Issuance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueDate
 * Issuance.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#IssueDiscountAllowance
 * Issuance.IssueDiscountAllowance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
 * Issuance.InterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
 * Issuance.RealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Purpose
 * Issuance.Purpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueSize
 * Issuance.IssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
 * Issuance.IssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#EventInformation
 * Issuance.EventInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
 * Issuance.IssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
 * Issuance.OriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
 * Issuance.IssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#GlobalNoteType
 * Issuance.GlobalNoteType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#CapitalRaised
 * Issuance.CapitalRaised}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#SubscriptionPeriod
 * Issuance.SubscriptionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Minimum
 * Issuance.Minimum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePrice
 * Issuance.IssuePrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Issuance
 * Asset.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
 * SecuritiesPricing.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
 * TradingMarket.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Issuance
 * DateTimePeriod.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
 * SecuritiesQuantity.RelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
 * SecuritiesQuantity.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
 * CorporateActionEvent.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
 * RateAndAmount.InterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
 * RateAndAmount.LossRelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Capital#AssetIssuance
 * Capital.AssetIssuance}</li>
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
 * "Issuance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * </ul>
 */
public class Issuance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the security was made available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#StartDate
	 * LoanContract1.StartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.StartDate);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Discount on a new issue or tranche of an existing issue.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDiscountAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discount on a new issue or tranche of an existing issue."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDiscountAllowance = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Discount on a new issue or tranche of an existing issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the interest payment and the expected or
	 * scheduled rate of the interest payment .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
	 * RateAndAmount.InterestRelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestShortfall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment ."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestShortfall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestShortfall";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment .";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the capital or principal repayment and the
	 * scheduled capital repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
	 * RateAndAmount.LossRelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RealisedLoss = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedLoss";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Identifies the issue size range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the issue size range."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueSize = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueSize";
			definition = "Identifies the issue size range.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total original amount or quantity published.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
	 * SecuritiesQuantity.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total original amount or quantity published."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssueNominalAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Parameters of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
	 * CorporateActionEvent.Issuance}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EventInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventInformation";
			definition = "Parameters of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset which is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#Issuance
	 * Asset.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuedAsset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedAsset";
			definition = "Asset which is issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Discount from par value at the time the security is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
	 * SecuritiesPricing.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIssueDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discount from par value at the time the security is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OriginalIssueDiscount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalIssueDiscount";
			definition = "Discount from par value at the time the security is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Primary market or country where an asset is issued by the issuer or its
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
	 * TradingMarket.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where an asset is issued by the issuer or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuePlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePlace";
			definition = "Primary market or country where an asset is issued by the issuer or its agent.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies if the security will be issued in New Global Note (NGN) or
	 * Classical Global Note (CGN).<br>
	 * New Global Note (NGN): Form of global certificate which refers to the
	 * books and records of the ICSDs to determine the issue outstanding amount
	 * (IOA). <br>
	 * Classical Global Note (CGN): Form of global certificate which requires
	 * physical annotation on the attached schedule to reflect changes in the
	 * issue outstanding amount (IOA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode
	 * GlobalNoteCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalNoteType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GlobalNoteType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalNoteType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GlobalNoteCode.mmObject();
		}
	};
	/**
	 * Capital raised through the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Capital#AssetIssuance
	 * Capital.AssetIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Capital Capital}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalRaised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capital raised through the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CapitalRaised = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalRaised";
			definition = "Capital raised through the issuance of an asset.";
			minOccurs = 0;
			type_lazy = () -> Capital.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Capital.AssetIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the security can be subscribed to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Issuance
	 * DateTimePeriod.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the security can be subscribed to."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPeriod";
			definition = "Period during which the security can be subscribed to.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum or incremental denomination required for the transfer or change
	 * of ownership of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
	 * SecuritiesQuantity.RelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minimum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or incremental denomination required for the transfer or change of ownership of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Minimum = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Minimum";
			definition = "Minimum or incremental denomination required for the transfer or change of ownership of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Initial issue price of a financial instrument.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssuePrice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Issuance";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.TradingMarket.Issuance,
						com.tools20022.repository.entity.DateTimePeriod.Issuance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance,
						com.tools20022.repository.entity.Capital.AssetIssuance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Issuance.IssueDate, com.tools20022.repository.entity.Issuance.IssueDiscountAllowance, com.tools20022.repository.entity.Issuance.InterestShortfall,
						com.tools20022.repository.entity.Issuance.RealisedLoss, com.tools20022.repository.entity.Issuance.Purpose, com.tools20022.repository.entity.Issuance.IssueSize,
						com.tools20022.repository.entity.Issuance.IssueNominalAmount, com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.Issuance.IssuedAsset,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.Issuance.GlobalNoteType,
						com.tools20022.repository.entity.Issuance.CapitalRaised, com.tools20022.repository.entity.Issuance.SubscriptionPeriod, com.tools20022.repository.entity.Issuance.Minimum,
						com.tools20022.repository.entity.Issuance.IssuePrice);
			}
		});
		return mmObject_lazy.get();
	}
}