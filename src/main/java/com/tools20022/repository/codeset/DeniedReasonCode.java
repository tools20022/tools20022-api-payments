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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DeniedReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the denied reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#AccountServicerDeadlineMissed
 * DeniedReasonCode.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#CallDeniedSinceAlreadyApplied
 * DeniedReasonCode.CallDeniedSinceAlreadyApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#DeniedSinceAlreadyCancelled
 * DeniedReasonCode.DeniedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#DeniedSinceNotAllowed
 * DeniedReasonCode.DeniedSinceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#DeniedSinceInProgress
 * DeniedReasonCode.DeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#DeniedSinceRepoEnded
 * DeniedReasonCode.DeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#DeniedSinceAlreadySettled
 * DeniedReasonCode.DeniedSinceAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#InstructionProcessed
 * DeniedReasonCode.InstructionProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#MarketDeadlineMissed
 * DeniedReasonCode.MarketDeadlineMissed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReasonCode#Other
 * DeniedReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#ConditionalCurrency
 * DeniedReasonCode.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#ConditionalRealignement
 * DeniedReasonCode.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode#ConditionalRegistrar
 * DeniedReasonCode.ConditionalRegistrar}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeniedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the denied reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeniedReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after the account servicer's deadline."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode AccountServicerDeadlineMissed = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Repo call request was denied since another call already applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallDeniedSinceAlreadyApplied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repo call request was denied since another call already applies."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode CallDeniedSinceAlreadyApplied = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			definition = "Repo call request was denied since another call already applies.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DCAL";
		}
	};
	/**
	 * Cancellation request was denied since the instruction has already been
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was denied since the instruction has already been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode DeniedSinceAlreadyCancelled = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadyCancelled";
			definition = "Cancellation request was denied since the instruction has already been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Repo call request was denied. Call not allowed on the concerned repo, for
	 * example, out of delay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode DeniedSinceNotAllowed = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			definition = "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Cancellation request was denied because the process of settlement is in
	 * progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was denied because the process of settlement is in progress."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode DeniedSinceInProgress = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			definition = "Cancellation request was denied because the process of settlement is in progress.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Cancellation request was denied because the repo was cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DREP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceRepoEnded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was denied because the repo was cancelled."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode DeniedSinceRepoEnded = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			definition = "Cancellation request was denied because the repo was cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DREP";
		}
	};
	/**
	 * Cancellation request was denied because the instruction was already
	 * settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was denied because the instruction was already settled."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode DeniedSinceAlreadySettled = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadySettled";
			definition = "Cancellation request was denied because the instruction was already settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Instruction has been processed and cannot be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been processed and cannot be cancelled."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode InstructionProcessed = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "IPNC";
		}
	};
	/**
	 * Received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after market deadline."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode MarketDeadlineMissed = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final DeniedReasonCode Other = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Execution is denied due to a process linked to the currency of the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to a process linked to the currency of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode ConditionalCurrency = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is denied due to a process linked to the currency of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is denied due to the execution of a process of realignment at
	 * the issuer CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to the execution of a process of realignment at the issuer CSD."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode ConditionalRealignement = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is denied due to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * Execution is denied due to the execution of a process at the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to the execution of a process at the registrar."
	 * </li>
	 * </ul>
	 */
	public static final DeniedReasonCode ConditionalRegistrar = new DeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is denied due to the execution of a process at the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReasonCode.mmObject();
			codeName = "CDRG";
		}
	};
	final static private LinkedHashMap<String, DeniedReasonCode> codesByName = new LinkedHashMap<>();

	protected DeniedReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeniedReasonCode";
				definition = "Specifies the denied reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeniedReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.DeniedReasonCode.CallDeniedSinceAlreadyApplied,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceAlreadyCancelled, com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceNotAllowed,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceInProgress, com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceRepoEnded,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceAlreadySettled, com.tools20022.repository.codeset.DeniedReasonCode.InstructionProcessed,
						com.tools20022.repository.codeset.DeniedReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.DeniedReasonCode.Other, com.tools20022.repository.codeset.DeniedReasonCode.ConditionalCurrency,
						com.tools20022.repository.codeset.DeniedReasonCode.ConditionalRealignement, com.tools20022.repository.codeset.DeniedReasonCode.ConditionalRegistrar);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CallDeniedSinceAlreadyApplied.getCodeName().get(), CallDeniedSinceAlreadyApplied);
		codesByName.put(DeniedSinceAlreadyCancelled.getCodeName().get(), DeniedSinceAlreadyCancelled);
		codesByName.put(DeniedSinceNotAllowed.getCodeName().get(), DeniedSinceNotAllowed);
		codesByName.put(DeniedSinceInProgress.getCodeName().get(), DeniedSinceInProgress);
		codesByName.put(DeniedSinceRepoEnded.getCodeName().get(), DeniedSinceRepoEnded);
		codesByName.put(DeniedSinceAlreadySettled.getCodeName().get(), DeniedSinceAlreadySettled);
		codesByName.put(InstructionProcessed.getCodeName().get(), InstructionProcessed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
	}

	public static DeniedReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeniedReasonCode[] values() {
		DeniedReasonCode[] values = new DeniedReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeniedReasonCode> {
		@Override
		public DeniedReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeniedReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}