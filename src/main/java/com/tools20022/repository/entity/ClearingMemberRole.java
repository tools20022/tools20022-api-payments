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
import com.tools20022.repository.codeset.ClearingSideCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmSide
 * ClearingMemberRole.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
 * ClearingMemberRole.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
 * ClearingMemberRole.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
 * ClearingMemberRole.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
 * SecuritiesAccount.mmClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
 * SecuritiesAccount.mmMarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
 * CashClearingSystemMember.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
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
 * "ClearingMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades."
 * </li>
 * </ul>
 */
public class ClearingMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystemMember clearingSystemMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
	 * CashClearingSystemMember.mmClearingMember}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, CashClearingSystemMember> mmClearingSystemMemberIdentification = new MMBusinessAssociationEnd<ClearingMemberRole, CashClearingSystemMember>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashClearingSystemMember.mmClearingMember;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}

		@Override
		public CashClearingSystemMember getValue(ClearingMemberRole obj) {
			return obj.getClearingSystemMemberIdentification();
		}

		@Override
		public void setValue(ClearingMemberRole obj, CashClearingSystemMember value) {
			obj.setClearingSystemMemberIdentification(value);
		}
	};
	protected ClearingSideCode side;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ClearingMemberRole, ClearingSideCode> mmSide = new MMBusinessAttribute<ClearingMemberRole, ClearingSideCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Specifies the side of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingSideCode.mmObject();
		}

		@Override
		public ClearingSideCode getValue(ClearingMemberRole obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(ClearingMemberRole obj, ClearingSideCode value) {
			obj.setSide(value);
		}
	};
	protected List<SecuritiesAccount> clearingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
	 * SecuritiesAccount.mmClearingAccountOwner}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>> mmClearingAccount = new MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesAccount.mmClearingAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(ClearingMemberRole obj) {
			return obj.getClearingAccount();
		}

		@Override
		public void setValue(ClearingMemberRole obj, List<SecuritiesAccount> value) {
			obj.setClearingAccount(value);
		}
	};
	protected List<SecuritiesAccount> marginAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
	 * SecuritiesAccount.mmMarginAccountOwner}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>> mmMarginAccount = new MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negociation and liquidation risks will be calculated.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesAccount.mmMarginAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(ClearingMemberRole obj) {
			return obj.getMarginAccount();
		}

		@Override
		public void setValue(ClearingMemberRole obj, List<SecuritiesAccount> value) {
			obj.setMarginAccount(value);
		}
	};
	protected List<SecuritiesAccount> deliveryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
	 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>> mmDeliveryAccount = new MMBusinessAssociationEnd<ClearingMemberRole, List<SecuritiesAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty).";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesAccount.mmDeliveryAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(ClearingMemberRole obj) {
			return obj.getDeliveryAccount();
		}

		@Override
		public void setValue(ClearingMemberRole obj, List<SecuritiesAccount> value) {
			obj.setDeliveryAccount(value);
		}
	};
	protected List<Account> defaultFundAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
	 * Account.mmDefaultFundAccountOwner}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, List<Account>> mmDefaultFundAccount = new MMBusinessAssociationEnd<ClearingMemberRole, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank.";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmDefaultFundAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(ClearingMemberRole obj) {
			return obj.getDefaultFundAccount();
		}

		@Override
		public void setValue(ClearingMemberRole obj, List<Account> value) {
			obj.setDefaultFundAccount(value);
		}
	};
	protected ClearingMemberRole clearingSegment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
	 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, ClearingMemberRole> mmClearingSegment = new MMBusinessAssociationEnd<ClearingMemberRole, ClearingMemberRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ClearingMemberRole.mmRelatedClearingMemberRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public ClearingMemberRole getValue(ClearingMemberRole obj) {
			return obj.getClearingSegment();
		}

		@Override
		public void setValue(ClearingMemberRole obj, ClearingMemberRole value) {
			obj.setClearingSegment(value);
		}
	};
	protected ClearingMemberRole relatedClearingMemberRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
	 * ClearingMemberRole.mmClearingSegment}</li>
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
	public static final MMBusinessAssociationEnd<ClearingMemberRole, ClearingMemberRole> mmRelatedClearingMemberRole = new MMBusinessAssociationEnd<ClearingMemberRole, ClearingMemberRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClearingMemberRole";
			definition = "Clearing member for which a clearing segment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ClearingMemberRole.mmClearingSegment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public ClearingMemberRole getValue(ClearingMemberRole obj) {
			return obj.getRelatedClearingMemberRole();
		}

		@Override
		public void setValue(ClearingMemberRole obj, ClearingMemberRole value) {
			obj.setRelatedClearingMemberRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingMemberRole";
				definition = "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmDefaultFundAccountOwner, SecuritiesAccount.mmClearingAccountOwner, SecuritiesAccount.mmMarginAccountOwner, SecuritiesAccount.mmDeliveryAccountOwner,
						CashClearingSystemMember.mmClearingMember, ClearingMemberRole.mmClearingSegment, ClearingMemberRole.mmRelatedClearingMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(ClearingMemberRole.mmClearingSystemMemberIdentification, ClearingMemberRole.mmSide, ClearingMemberRole.mmClearingAccount, ClearingMemberRole.mmMarginAccount,
						ClearingMemberRole.mmDeliveryAccount, ClearingMemberRole.mmDefaultFundAccount, ClearingMemberRole.mmClearingSegment, ClearingMemberRole.mmRelatedClearingMemberRole);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClearingMemberRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystemMember getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public ClearingMemberRole setClearingSystemMemberIdentification(CashClearingSystemMember clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = Objects.requireNonNull(clearingSystemMemberIdentification);
		return this;
	}

	public ClearingSideCode getSide() {
		return side;
	}

	public ClearingMemberRole setSide(ClearingSideCode side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public List<SecuritiesAccount> getClearingAccount() {
		return clearingAccount == null ? clearingAccount = new ArrayList<>() : clearingAccount;
	}

	public ClearingMemberRole setClearingAccount(List<SecuritiesAccount> clearingAccount) {
		this.clearingAccount = Objects.requireNonNull(clearingAccount);
		return this;
	}

	public List<SecuritiesAccount> getMarginAccount() {
		return marginAccount == null ? marginAccount = new ArrayList<>() : marginAccount;
	}

	public ClearingMemberRole setMarginAccount(List<SecuritiesAccount> marginAccount) {
		this.marginAccount = Objects.requireNonNull(marginAccount);
		return this;
	}

	public List<SecuritiesAccount> getDeliveryAccount() {
		return deliveryAccount == null ? deliveryAccount = new ArrayList<>() : deliveryAccount;
	}

	public ClearingMemberRole setDeliveryAccount(List<SecuritiesAccount> deliveryAccount) {
		this.deliveryAccount = Objects.requireNonNull(deliveryAccount);
		return this;
	}

	public List<Account> getDefaultFundAccount() {
		return defaultFundAccount == null ? defaultFundAccount = new ArrayList<>() : defaultFundAccount;
	}

	public ClearingMemberRole setDefaultFundAccount(List<Account> defaultFundAccount) {
		this.defaultFundAccount = Objects.requireNonNull(defaultFundAccount);
		return this;
	}

	public ClearingMemberRole getClearingSegment() {
		return clearingSegment;
	}

	public ClearingMemberRole setClearingSegment(ClearingMemberRole clearingSegment) {
		this.clearingSegment = Objects.requireNonNull(clearingSegment);
		return this;
	}

	public ClearingMemberRole getRelatedClearingMemberRole() {
		return relatedClearingMemberRole;
	}

	public ClearingMemberRole setRelatedClearingMemberRole(ClearingMemberRole relatedClearingMemberRole) {
		this.relatedClearingMemberRole = Objects.requireNonNull(relatedClearingMemberRole);
		return this;
	}
}