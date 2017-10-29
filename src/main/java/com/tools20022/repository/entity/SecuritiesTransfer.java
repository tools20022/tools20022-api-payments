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
import com.tools20022.repository.codeset.PartialSettlementCode;
import com.tools20022.repository.codeset.TransferReasonCode;
import com.tools20022.repository.codeset.TransferTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTransfer" src="doc-files/SecuritiesTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Identification
 * SecuritiesTransfer.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
 * SecuritiesTransfer.TransferredQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
 * SecuritiesTransfer.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferType
 * SecuritiesTransfer.TransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
 * SecuritiesTransfer.RelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#OwnAccountTransferIndicator
 * SecuritiesTransfer.OwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PhysicalDelivery
 * SecuritiesTransfer.PhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#LateDeliveryDate
 * SecuritiesTransfer.LateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
 * SecuritiesTransfer.TransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferReason
 * SecuritiesTransfer.TransferReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PartialSettlementType
 * SecuritiesTransfer.PartialSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#BookEntry
 * SecuritiesTransfer.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransactionIdentification
 * SecuritiesTransfer.TransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
 * SecuritiesTransfer.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
 * SecuritiesTransfer.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
 * Security.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
 * SecuritiesAccount.RelatedTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
 * Tax.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
 * SecuritiesQuantity.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
 * SecuritiesSettlement.TransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#TriggeringSecuritiesTransfer
 * SecuritiesEntry.TriggeringSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RelatedTransfer
 * PhysicalDelivery.RelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
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
 * "SecuritiesTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * </ul>
 */
public class SecuritiesTransfer extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a transfer, as assigned by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a transfer, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total quantity of securities settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
	 * SecuritiesQuantity.SecuritiesTransfer}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferredQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account from/to which the securities are transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
	 * SecuritiesAccount.RelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account from/to which the securities are transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the financial instrument is transferred as an asset or
	 * as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferTypeCode
	 * TransferTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument is transferred as an asset or as cash."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}
	};
	/**
	 * Settlement process which is the source of the transfer operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
	 * SecuritiesSettlement.TransferOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process which is the source of the transfer operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnAccountTransferIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to physical delivery of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RelatedTransfer
	 * PhysicalDelivery.RelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Information related to physical delivery of the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LateDeliveryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
	 * Tax.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the transfer reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transfer reason."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}
	};
	/**
	 * Information about partial settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode
	 * PartialSettlementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about partial settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}
	};
	/**
	 * Obligation for one party to deliver securities to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
	 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for one party to deliver securities to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation for one party to deliver securities to another party.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record in a securities account resulting from the transfer of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#TriggeringSecuritiesTransfer
	 * SecuritiesEntry.TriggeringSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record in a securities account resulting from the transfer of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unambiguous identification of a securities transfer.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Security which is transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
	 * Security.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is transferred.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
	 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer,
						com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation,
						com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.Identification, com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.SecuritiesTransfer.TransferType, com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.OwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.LateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax, com.tools20022.repository.entity.SecuritiesTransfer.TransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.PartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.BookEntry, com.tools20022.repository.entity.SecuritiesTransfer.TransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.Security,
						com.tools20022.repository.entity.SecuritiesTransfer.Status);
			}
		});
		return mmObject_lazy.get();
	}
}