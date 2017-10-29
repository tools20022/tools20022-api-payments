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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.DistributionInstructionTypeCode;
import com.tools20022.repository.codeset.DistributionTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of the proceeds of a CA event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionDistribution"
 * src="doc-files/CorporateActionDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
 * CorporateActionDistribution.PostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingDateTime
 * CorporateActionDistribution.PostingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#MovementDate
 * CorporateActionDistribution.MovementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingAmount
 * CorporateActionDistribution.PostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#TaxVoucher
 * CorporateActionDistribution.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RelatedServicing
 * CorporateActionDistribution.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#OrderType
 * CorporateActionDistribution.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#MovementType
 * CorporateActionDistribution.MovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#HighPriorityIndicator
 * CorporateActionDistribution.HighPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#RequestedExecutionDate
 * CorporateActionDistribution.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FractionTreatment
 * CorporateActionDistribution.FractionTreatment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CreditDebitIndicator
 * CorporateActionDistribution.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
 * CorporateActionDistribution.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#NetAmount
 * CorporateActionDistribution.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#GrossAmount
 * CorporateActionDistribution.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FinancialTransaction
 * CorporateActionDistribution.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
 * SecuritiesQuantity.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
 * CorporateActionOption.Distribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#Distribution
 * TaxVoucher.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionDistribution
 * CorporateActionServicing.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CorporateActionDistribution
 * FinancialTransaction.CorporateActionDistribution}</li>
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
 * "CorporateActionDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Distribution of the proceeds of a CA event."</li>
 * </ul>
 */
public class CorporateActionDistribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities that have been posted (credit or debit) to the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
	 * SecuritiesQuantity.CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that have been posted (credit or debit) to the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PostingQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingQuantity";
			definition = "Quantity of securities that have been posted (credit or debit) to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the posting (credit or debit) to the account.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the posting (credit or debit) to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostingDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingDateTime";
			definition = "Date of the posting (credit or debit) to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the movement is due to take place (cash and/or
	 * securities).
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money that is to be/was posted to the account.
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#AnnouncedPostingAmount
	 * AmountAndCurrencyExchange3.AnnouncedPostingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange3.AnnouncedPostingAmount);
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies tax vouchers in the framework of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#Distribution
	 * TaxVoucher.Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax vouchers in the framework of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Specifies tax vouchers in the framework of a corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionDistribution
	 * CorporateActionServicing.CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of movement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Type of movement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionTypeCode.mmObject();
		}
	};
	/**
	 * Type of movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MovementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementType";
			definition = "Type of movement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionInstructionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the movement is a high priority or not.<br>
	 * Meaning when true: High priority<br>
	 * Meaning when false: Standard
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighPriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HighPriorityIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighPriorityIndicator";
			definition = "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the distribution movement must be executed.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the distribution movement must be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the distribution movement must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the rounding direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionTreatment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the rounding direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FractionTreatment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies the rounding direction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Specifies whether the posting amount is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the posting amount is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the posting amount is a debit or credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Option on which the distribution is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
	 * CorporateActionOption.Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the distribution is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the distribution is based.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount after any deductions and allowances have been made
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount after any deductions and allowances have been made"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Cash amount after any deductions and allowances have been made";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount before any deductions and allowances have been made.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Cash amount before any deductions and allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Financial transaction to which the CA distribution belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CorporateActionDistribution
	 * FinancialTransaction.CorporateActionDistribution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the CA distribution belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the CA distribution belongs.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the delivery instructions for the securities and cash proceeds
	 * at any stage of the Corporate Action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
	 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionProceedsDeliveryInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionProceedsDeliveryInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionDistribution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionProceedsDeliveryInstruction";
			definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDistribution";
				definition = "Distribution of the proceeds of a CA event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution, com.tools20022.repository.entity.CorporateActionOption.Distribution,
						com.tools20022.repository.entity.TaxVoucher.Distribution, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution, com.tools20022.repository.entity.FinancialTransaction.CorporateActionDistribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity, com.tools20022.repository.entity.CorporateActionDistribution.PostingDateTime,
						com.tools20022.repository.entity.CorporateActionDistribution.MovementDate, com.tools20022.repository.entity.CorporateActionDistribution.PostingAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher, com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionDistribution.OrderType, com.tools20022.repository.entity.CorporateActionDistribution.MovementType,
						com.tools20022.repository.entity.CorporateActionDistribution.HighPriorityIndicator, com.tools20022.repository.entity.CorporateActionDistribution.RequestedExecutionDate,
						com.tools20022.repository.entity.CorporateActionDistribution.FractionTreatment, com.tools20022.repository.entity.CorporateActionDistribution.CreditDebitIndicator,
						com.tools20022.repository.entity.CorporateActionDistribution.Option, com.tools20022.repository.entity.CorporateActionDistribution.NetAmount, com.tools20022.repository.entity.CorporateActionDistribution.GrossAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.FinancialTransaction, com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}