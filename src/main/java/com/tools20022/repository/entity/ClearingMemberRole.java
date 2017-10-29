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
import com.tools20022.repository.codeset.ClearingSideCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Member of an exchange's clearing corporation, responsible for executing
 * client trades and involved in the clearing of trades.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingMemberRole" src="doc-files/ClearingMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSystemMemberIdentification
 * ClearingMemberRole.ClearingSystemMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingMemberRole#Side
 * ClearingMemberRole.Side}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingAccount
 * ClearingMemberRole.ClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#MarginAccount
 * ClearingMemberRole.MarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DeliveryAccount
 * ClearingMemberRole.DeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DefaultFundAccount
 * ClearingMemberRole.DefaultFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSegment
 * ClearingMemberRole.ClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#RelatedClearingMemberRole
 * ClearingMemberRole.RelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundAccountOwner
 * Account.DefaultFundAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountOwner
 * SecuritiesAccount.ClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#MarginAccountOwner
 * SecuritiesAccount.MarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DeliveryAccountOwner
 * SecuritiesAccount.DeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#ClearingMember
 * CashClearingSystemMember.ClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSegment
 * ClearingMemberRole.ClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#RelatedClearingMemberRole
 * ClearingMemberRole.RelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "ClearingMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades."
 * </li>
 * </ul>
 */
public class ClearingMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#ClearingMember
	 * CashClearingSystemMember.ClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashClearingSystemMember.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the side of the clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSideCode
	 * ClearingSideCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the side of the clearing member."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Side = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Specifies the side of the clearing member.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingSideCode.mmObject();
		}
	};
	/**
	 * Identifies the clearing member account at the CCP through which the trade
	 * must be cleared (sometimes called position account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountOwner
	 * SecuritiesAccount.ClearingAccountOwner}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			minOccurs = 0;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Margin account where the negociation and liquidation risks will be
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#MarginAccountOwner
	 * SecuritiesAccount.MarginAccountOwner}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin account where the negociation and liquidation risks will be calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarginAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negociation and liquidation risks will be calculated.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account opened by the central counterparty in the name of the clearing
	 * member within the account structure, for settlement purposes (gives
	 * information about the clearing member account at central counterparty).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DeliveryAccountOwner
	 * SecuritiesAccount.DeliveryAccountOwner}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeliveryAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty).";
			minOccurs = 0;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account identification of the clearing member at the ICSD
	 * (International Central Securities Depository) or at the Central Bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundAccountOwner
	 * Account.DefaultFundAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DefaultFundAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.DefaultFundAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing segment within a clearing organisation that allows the
	 * segregation of flows coming from clearing counterparty's clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#RelatedClearingMemberRole
	 * ClearingMemberRole.RelatedClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSegment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member for which a clearing segment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingSegment
	 * ClearingMemberRole.ClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClearingMemberRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member for which a clearing segment is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedClearingMemberRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClearingMemberRole";
			definition = "Clearing member for which a clearing segment is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingMemberRole";
				definition = "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.DefaultFundAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner,
						com.tools20022.repository.entity.CashClearingSystemMember.ClearingMember, com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingMemberRole.ClearingSystemMemberIdentification, com.tools20022.repository.entity.ClearingMemberRole.Side,
						com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.MarginAccount, com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount,
						com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount, com.tools20022.repository.entity.ClearingMemberRole.ClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.RelatedClearingMemberRole);
			}
		});
		return mmObject_lazy.get();
	}
}