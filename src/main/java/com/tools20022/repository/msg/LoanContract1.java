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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.InterestPaymentSchedule1Choice;
import com.tools20022.repository.choice.InterestRate2Choice;
import com.tools20022.repository.choice.PaymentSchedule1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Exact1NumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.BuyerRole;
import com.tools20022.repository.entity.Loan;
import com.tools20022.repository.entity.SellerRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contract by which an amount of money in exchange for future repayment of the
 * principal amount along with interest or other finance charges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#ContractDocumentIdentification
 * LoanContract1.ContractDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Buyer
 * LoanContract1.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Seller
 * LoanContract1.Seller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Amount
 * LoanContract1.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#MaturityDate
 * LoanContract1.MaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#ProlongationFlag
 * LoanContract1.ProlongationFlag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#StartDate
 * LoanContract1.StartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#SettlementCurrency
 * LoanContract1.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#SpecialConditions
 * LoanContract1.SpecialConditions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#DurationCode
 * LoanContract1.DurationCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#InterestRate
 * LoanContract1.InterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Tranche
 * LoanContract1.Tranche}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#PaymentSchedule
 * LoanContract1.PaymentSchedule}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#InterestSchedule
 * LoanContract1.InterestSchedule}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#IntraCompanyLoan
 * LoanContract1.IntraCompanyLoan}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Collateral
 * LoanContract1.Collateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#SyndicatedLoan
 * LoanContract1.SyndicatedLoan}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Attachment
 * LoanContract1.Attachment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
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
 * "LoanContract1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contract by which an amount of money in exchange for future repayment of the principal amount along with interest or other finance charges."
 * </li>
 * </ul>
 */
public class LoanContract1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contract document referenced from this loan agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#Identification
	 * Security.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract document referenced from this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContractDocumentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.Identification;
			isDerived = false;
			xmlTag = "CtrctDocId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDocumentIdentification";
			definition = "Contract document referenced from this loan agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}
	};
	/**
	 * Party that is specified as the buyer for this loan agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is specified as the buyer for this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Buyer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that is specified as the buyer for this loan agreement.";
			minOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Party that is specified as the seller for this loan agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is specified as the seller for this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Seller = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that is specified as the seller for this loan agreement.";
			minOccurs = 1;
			type_lazy = () -> TradeParty2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Loan amount as defined in the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#PrincipalAmount
	 * Loan.PrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan amount as defined in the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.PrincipalAmount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Loan amount as defined in the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Planned final repayment date at the time of issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#MaturityDate
	 * Asset.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaturityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.MaturityDate;
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Indicates whether the contract duration is extended or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrlngtnFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProlongationFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the contract duration is extended or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ProlongationFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "PrlngtnFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProlongationFlag";
			definition = "Indicates whether the contract duration is extended or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Start date of the loan contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueDate
	 * Issuance.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date of the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute StartDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueDate;
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Start date of the loan contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Currency in which the loan is being settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionQuotedCurrency
	 * SecuritiesConversion.ConversionQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the loan is being settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionQuotedCurrency;
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which the loan is being settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	/**
	 * When the amount is credited outside of the country, special conditions
	 * are applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the amount is credited outside of the country, special conditions are applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SpecialConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "SpclConds";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			definition = "When the amount is credited outside of the country, special conditions are applicable.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SpecialCondition1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Loan duration in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact1NumericText
	 * Exact1NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrtnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan duration in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DurationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "DrtnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DurationCode";
			definition = "Loan duration in a coded form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact1NumericText.mmObject();
		}
	};
	/**
	 * Interest rate for the loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestRate2Choice
	 * InterestRate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#Percentage
	 * PaymentTerms.Percentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate for the loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InterestRate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentTerms.Percentage;
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Interest rate for the loan.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestRate2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * One part or division of the loan, used to define the repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LoanContractTranche1
	 * LoanContractTranche1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#Tranche Asset.Tranche}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One part or division of the loan, used to define the repayment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Tranche = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.Tranche;
			isDerived = false;
			xmlTag = "Trch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One part or division of the loan, used to define the repayment.";
			minOccurs = 0;
			type_lazy = () -> LoanContractTranche1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Schedule of the payments defined for the loan contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice
	 * PaymentSchedule1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentTerms
	 * PaymentObligation.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Schedule of the payments defined for the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentSchedule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentTerms;
			isDerived = false;
			xmlTag = "PmtSchdl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSchedule";
			definition = "Schedule of the payments defined for the loan contract.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentSchedule1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Schedule of the interest payments defined for the loan contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice
	 * InterestPaymentSchedule1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#InterestPaymentsSchedule
	 * Loan.InterestPaymentsSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Schedule of the interest payments defined for the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InterestSchedule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.InterestPaymentsSchedule;
			isDerived = false;
			xmlTag = "IntrstSchdl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestSchedule";
			definition = "Schedule of the interest payments defined for the loan contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestPaymentSchedule1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Loan is an intra company loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#IntraCompanyLoanIndicator
	 * Loan.IntraCompanyLoanIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraCpnyLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan is an intra company loan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IntraCompanyLoan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Loan.IntraCompanyLoanIndicator;
			isDerived = false;
			xmlTag = "IntraCpnyLn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyLoan";
			definition = "Loan is an intra company loan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Details of the collateral for the loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractCollateral1
	 * ContractCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
	 * CollateralAgreement.Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the collateral for the loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Collateral = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.Collateral;
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Details of the collateral for the loan.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContractCollateral1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Loan offered by a group of lenders (called a syndicate) who work together
	 * to provide funds for a single borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndctdLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicatedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan offered by a group of lenders (called a syndicate) who work together to provide funds for a single borrower. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SyndicatedLoan = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessComponentTrace_lazy = () -> Loan.mmObject();
			isDerived = false;
			xmlTag = "SndctdLn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicatedLoan";
			definition = "Loan offered by a group of lenders (called a syndicate) who work together to provide funds for a single borrower. ";
			minOccurs = 0;
			type_lazy = () -> SyndicatedLoan1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Documents provided as attachments to the loan contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#Attachment
	 * RegisteredContract.Attachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attchmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents provided as attachments to the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Attachment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LoanContract1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the loan contract.";
			minOccurs = 0;
			type_lazy = () -> DocumentGeneralInformation3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.ContractDocumentIdentification, com.tools20022.repository.msg.LoanContract1.Buyer, com.tools20022.repository.msg.LoanContract1.Seller,
						com.tools20022.repository.msg.LoanContract1.Amount, com.tools20022.repository.msg.LoanContract1.MaturityDate, com.tools20022.repository.msg.LoanContract1.ProlongationFlag,
						com.tools20022.repository.msg.LoanContract1.StartDate, com.tools20022.repository.msg.LoanContract1.SettlementCurrency, com.tools20022.repository.msg.LoanContract1.SpecialConditions,
						com.tools20022.repository.msg.LoanContract1.DurationCode, com.tools20022.repository.msg.LoanContract1.InterestRate, com.tools20022.repository.msg.LoanContract1.Tranche,
						com.tools20022.repository.msg.LoanContract1.PaymentSchedule, com.tools20022.repository.msg.LoanContract1.InterestSchedule, com.tools20022.repository.msg.LoanContract1.IntraCompanyLoan,
						com.tools20022.repository.msg.LoanContract1.Collateral, com.tools20022.repository.msg.LoanContract1.SyndicatedLoan, com.tools20022.repository.msg.LoanContract1.Attachment);
				trace_lazy = () -> Loan.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LoanContract1";
				definition = "Contract by which an amount of money in exchange for future repayment of the principal amount along with interest or other finance charges.";
			}
		});
		return mmObject_lazy.get();
	}
}