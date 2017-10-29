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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.TransactionReferences3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeIdentification" src="doc-files/TradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CounterpartyReference
 * TradeIdentification.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#Identification
 * TradeIdentification.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CommonIdentification
 * TradeIdentification.CommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#MatchingReference
 * TradeIdentification.MatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#Trade
 * TradeIdentification.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#UniqueTradeIdentifier
 * TradeIdentification.UniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#ClearingBrokerIdentification
 * TradeIdentification.ClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#TradeRelatedIdentifications
 * Trade.TradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#RelatedTradeIdentification
 * ClearingBrokerIdentification.RelatedTradeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences3
 * TransactionReferences3}</li>
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
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the trade allocated by the counterparty.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the trade allocated by the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CounterpartyReference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#ContractIdentification
	 * CurrencyExchange5.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#ContractIdentification
	 * ExchangeRate1.ContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#PaymentInformationIdentification
	 * TransactionReferences4.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#PaymentInformationIdentification
	 * CertificateIdentification1.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalItemIdentification
	 * OriginalItemAndStatus5.OriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#Identification
	 * NotificationItem6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#PaymentInformationIdentification
	 * PaymentInstruction21.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction23.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#PaymentInformationIdentification
	 * PaymentInstruction23.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction24.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentInformationIdentification
	 * PaymentInstruction22.PaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction22.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.OriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#PaymentInformationIdentification
	 * CorrectivePaymentInitiation2.PaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchange5.ContractIdentification, com.tools20022.repository.msg.ExchangeRate1.ContractIdentification,
					com.tools20022.repository.msg.TransactionReferences4.PaymentInformationIdentification, com.tools20022.repository.msg.CertificateIdentification1.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalItemIdentification, com.tools20022.repository.msg.NotificationItem6.Identification,
					com.tools20022.repository.msg.PaymentInstruction21.PaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction23.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction21.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction23.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction22.PaymentInformationIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.PaymentInformationIdentification);
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CommonIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference assigned by a matching system when the trade is matched.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a matching system when the trade is matched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingReference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the trade for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#TradeRelatedIdentifications
	 * Trade.TradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.TradeRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * This field specifies the unique transaction identifier (UTI) to be
	 * created at the time a transaction is first executed, shared with all
	 * registered entities and counterparties involved in the transaction, and
	 * used to track that particular transaction over its life. This identifier
	 * can also be known as the Unique Swap Identifier (USI).
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UniqueTradeIdentifier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference number assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#RelatedTradeIdentification
	 * ClearingBrokerIdentification.RelatedTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference number assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingBrokerIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.RelatedTradeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.TradeRelatedIdentifications, com.tools20022.repository.entity.ClearingBrokerIdentification.RelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.CounterpartyReference, com.tools20022.repository.entity.TradeIdentification.Identification,
						com.tools20022.repository.entity.TradeIdentification.CommonIdentification, com.tools20022.repository.entity.TradeIdentification.MatchingReference, com.tools20022.repository.entity.TradeIdentification.Trade,
						com.tools20022.repository.entity.TradeIdentification.UniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.ClearingBrokerIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransactionReferences3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}