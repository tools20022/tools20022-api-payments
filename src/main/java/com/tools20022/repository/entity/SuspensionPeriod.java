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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period defining the last date for which an action will be accepted and the
 * date on which the suspension will be released and normal processing will
 * resume.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SuspensionPeriod" src="doc-files/SuspensionPeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
 * SuspensionPeriod.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
 * CorporateActionEvent.mmSuspensionPeriod}</li>
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
 * "SuspensionPeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
 * </li>
 * </ul>
 */
public class SuspensionPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod privilegeSuspensionPeriod;
	/**
	 * Period during which the privilege is not available, eg, this can happen
	 * whenever a meeting takes place or whenever a coupon payment is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
	 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrivilegeSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawal;
	/**
	 * Period defining the last date on which withdrawal in street name requests
	 * on the outturn security will be accepted and the date on which the
	 * suspension will be released and withdrawal by transfer processing on the
	 * outturn security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForBookEntryTransfer;
	/**
	 * Period defining the last date for which book entry transfers will be
	 * accepted and the date on which the suspension will be released and book
	 * entry transfer processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
	 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForBookEntryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForBookEntryTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForDepositAtAgent;
	/**
	 * Period defining the last date for which deposits, into nominee name, at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and deposits at agent will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDepositAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForDepositAtAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForDeposit;
	/**
	 * Period defining the last date for which deposits will be accepted and the
	 * date on which the suspension will be released and deposits will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
	 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForPledge;
	/**
	 * Period defining the last date for which pledges will be accepted and the
	 * date on which the suspension will be released and pledge processing will
	 * resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
	 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForPledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForPledge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForSegregation;
	/**
	 * Period defining the last date for which intra-position balances can be
	 * segregated and the date on which the suspension will be released and the
	 * ability to segregate intra-position balances will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
	 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForSegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForSegregation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalAtAgent;
	/**
	 * Period defining the last date for which withdrawals, from nominee name at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and withdrawals at agent processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalInNomineeName;
	/**
	 * Period defining the last date for which physical withdrawals in the
	 * nominee's name will be accepted and the date on which the suspension will
	 * be released and physical withdrawals in the nominee's name will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInNomineeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalInStreetName;
	/**
	 * Period defining the last date on which withdrawal requests in street
	 * name's will be accepted on the event security and the date on which the
	 * suspension will be released and withdrawal in street name's processing on
	 * the event security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInStreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod coDepositoriesSuspensionPeriod;
	/**
	 * Period during which the settlement activities at the co-depositories are
	 * suspended in order to stabilise the holdings at the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
	 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCoDepositoriesSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate action event for which a depository suspension period is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
	 * CorporateActionEvent.mmSuspensionPeriod}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a depository suspension period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action event for which a depository suspension period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuspensionPeriod";
				definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent, com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SuspensionPeriod.mmPrivilegeSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForPledge,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName,
						com.tools20022.repository.entity.SuspensionPeriod.mmCoDepositoriesSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SuspensionPeriod.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod;
	}

	public void setPrivilegeSuspensionPeriod(com.tools20022.repository.entity.DateTimePeriod privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = privilegeSuspensionPeriod;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawal() {
		return depositorySuspensionPeriodForWithdrawal;
	}

	public void setDepositorySuspensionPeriodForWithdrawal(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawal) {
		this.depositorySuspensionPeriodForWithdrawal = depositorySuspensionPeriodForWithdrawal;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer;
	}

	public void setDepositorySuspensionPeriodForBookEntryTransfer(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = depositorySuspensionPeriodForBookEntryTransfer;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent;
	}

	public void setDepositorySuspensionPeriodForDepositAtAgent(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = depositorySuspensionPeriodForDepositAtAgent;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit;
	}

	public void setDepositorySuspensionPeriodForDeposit(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = depositorySuspensionPeriodForDeposit;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge;
	}

	public void setDepositorySuspensionPeriodForPledge(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = depositorySuspensionPeriodForPledge;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation;
	}

	public void setDepositorySuspensionPeriodForSegregation(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = depositorySuspensionPeriodForSegregation;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public void setDepositorySuspensionPeriodForWithdrawalAtAgent(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = depositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInNomineeName(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = depositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInStreetName(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = depositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public DateTimePeriod getCoDepositoriesSuspensionPeriod() {
		return coDepositoriesSuspensionPeriod;
	}

	public void setCoDepositoriesSuspensionPeriod(com.tools20022.repository.entity.DateTimePeriod coDepositoriesSuspensionPeriod) {
		this.coDepositoriesSuspensionPeriod = coDepositoriesSuspensionPeriod;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}
}