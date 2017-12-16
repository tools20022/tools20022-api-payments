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
import com.tools20022.repository.codeset.ReasonBlockedCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information about blocked accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Bankruptcy
 * ReasonBlockedCode.mmBankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Commitment
 * ReasonBlockedCode.mmCommitment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Confiscation
 * ReasonBlockedCode.mmConfiscation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#MortisCausa
 * ReasonBlockedCode.mmMortisCausa}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Pledged
 * ReasonBlockedCode.mmPledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Reregistration
 * ReasonBlockedCode.mmReregistration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReasonBlockedCode#Transfer
 * ReasonBlockedCode.mmTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BKRP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReasonBlockedCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies information about blocked accounts."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReasonBlockedCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is part of a bankruptcy action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is part of a bankruptcy action."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Bankruptcy = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bankruptcy";
			definition = "Account is part of a bankruptcy action.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "BKRP";
		}
	};
	/**
	 * Account has been given as a warranty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commitment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account has been given as a warranty."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Commitment = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			definition = "Account has been given as a warranty.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "CMNT";
		}
	};
	/**
	 * Account is confiscated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confiscation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is confiscated."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Confiscation = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			definition = "Account is confiscated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "CNFS";
		}
	};
	/**
	 * Account is reserved in contemplation of death.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortisCausa"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is reserved in contemplation of death."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode MortisCausa = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			definition = "Account is reserved in contemplation of death.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Account has been given as pledge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account has been given as pledge."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Pledged = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Account has been given as pledge.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "PLDG";
		}
	};
	/**
	 * Account is being reregistered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reregistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is being reregistered."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Reregistration = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			definition = "Account is being reregistered.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Account is being transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is being transferred."</li>
	 * </ul>
	 */
	public static final ReasonBlockedCode Transfer = new ReasonBlockedCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Account is being transferred.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReasonBlockedCode.mmObject();
			codeName = "TRNF";
		}
	};
	final static private LinkedHashMap<String, ReasonBlockedCode> codesByName = new LinkedHashMap<>();

	protected ReasonBlockedCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BKRP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReasonBlockedCode";
				definition = "Specifies information about blocked accounts.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReasonBlockedCode.Bankruptcy, com.tools20022.repository.codeset.ReasonBlockedCode.Commitment,
						com.tools20022.repository.codeset.ReasonBlockedCode.Confiscation, com.tools20022.repository.codeset.ReasonBlockedCode.MortisCausa, com.tools20022.repository.codeset.ReasonBlockedCode.Pledged,
						com.tools20022.repository.codeset.ReasonBlockedCode.Reregistration, com.tools20022.repository.codeset.ReasonBlockedCode.Transfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(Commitment.getCodeName().get(), Commitment);
		codesByName.put(Confiscation.getCodeName().get(), Confiscation);
		codesByName.put(MortisCausa.getCodeName().get(), MortisCausa);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(Reregistration.getCodeName().get(), Reregistration);
		codesByName.put(Transfer.getCodeName().get(), Transfer);
	}

	public static ReasonBlockedCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReasonBlockedCode[] values() {
		ReasonBlockedCode[] values = new ReasonBlockedCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReasonBlockedCode> {
		@Override
		public ReasonBlockedCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReasonBlockedCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}