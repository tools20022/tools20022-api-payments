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
import com.tools20022.repository.codeset.VoteInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the possible types of voting instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.VoteInstructionCode#For
 * VoteInstructionCode.mmFor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#Against
 * VoteInstructionCode.mmAgainst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#Abstain
 * VoteInstructionCode.mmAbstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#Withhold
 * VoteInstructionCode.mmWithhold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#WithManagement
 * VoteInstructionCode.mmWithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#AgainstManagement
 * VoteInstructionCode.mmAgainstManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#Discretionary
 * VoteInstructionCode.mmDiscretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#NoAction
 * VoteInstructionCode.mmNoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#Chairman
 * VoteInstructionCode.mmChairman}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#OneYear
 * VoteInstructionCode.mmOneYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#TwoYears
 * VoteInstructionCode.mmTwoYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode#ThreeYears
 * VoteInstructionCode.mmThreeYears}</li>
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
 * <li>"CFOR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the possible types of voting instructions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class VoteInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Vote in favour of a meeting resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote in favour of a meeting resolution."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode For = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "For";
			definition = "Vote in favour of a meeting resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "CFOR";
		}
	};
	/**
	 * Vote against a meeting resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote against a meeting resolution."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode Against = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Against";
			definition = "Vote against a meeting resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "CAGS";
		}
	};
	/**
	 * Active vote expressed as abstain (no opinion).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Active vote expressed as abstain (no opinion)."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode Abstain = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Active vote expressed as abstain (no opinion).";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "ABST";
		}
	};
	/**
	 * Participant to a meeting withholds its vote for a meeting resolution .
	 * This action is usually taken in order to indicate a strong disagreement
	 * with a resolution (US market).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant to a meeting withholds its vote for a meeting resolution . This action is usually taken in order to indicate a strong disagreement with a resolution (US market)."
	 * </li>
	 * </ul>
	 */
	public static final VoteInstructionCode Withhold = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withhold";
			definition = "Participant to a meeting withholds its vote for a meeting resolution . This action is usually taken in order to indicate a strong disagreement with a resolution (US market).";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "WTHH";
		}
	};
	/**
	 * Vote instruction is in line with the voting recommendations of the
	 * management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WMGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote instruction is in line with the voting recommendations of the management."
	 * </li>
	 * </ul>
	 */
	public static final VoteInstructionCode WithManagement = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithManagement";
			definition = "Vote instruction is in line with the voting recommendations of the management.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "WMGT";
		}
	};
	/**
	 * Vote instruction is in against the voting recommendations of the
	 * management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote instruction is in against the voting recommendations of the management."
	 * </li>
	 * </ul>
	 */
	public static final VoteInstructionCode AgainstManagement = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgainstManagement";
			definition = "Vote instruction is in against the voting recommendations of the management.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "AMGT";
		}
	};
	/**
	 * Voting party is assigned discretionary right to vote for one resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Voting party is assigned discretionary right to vote for one resolution."
	 * </li>
	 * </ul>
	 */
	public static final VoteInstructionCode Discretionary = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Voting party is assigned discretionary right to vote for one resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Indicates a recommendation to take no action
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a recommendation to take no action"</li>
	 * </ul>
	 */
	public static final VoteInstructionCode NoAction = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Indicates a recommendation to take no action";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Specifies that the rights holder gives authority to the chairman to vote
	 * on his behalf.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chairman"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the rights holder gives authority to the chairman to vote on his behalf."
	 * </li>
	 * </ul>
	 */
	public static final VoteInstructionCode Chairman = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Chairman";
			definition = "Specifies that the rights holder gives authority to the chairman to vote on his behalf.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "CHRM";
		}
	};
	/**
	 * Vote in favour for one year for "say on pay" type of resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONEY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote in favour for one year for \"say on pay\" type of resolution."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode OneYear = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			definition = "Vote in favour for one year for \"say on pay\" type of resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "ONEY";
		}
	};
	/**
	 * Vote in favour for two years for "say on pay" type of resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWOY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote in favour for two years for \"say on pay\" type of resolution."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode TwoYears = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			definition = "Vote in favour for two years for \"say on pay\" type of resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "TWOY";
		}
	};
	/**
	 * Vote in favour for three years for "say on pay" type of resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote in favour for three years for \"say on pay\" type of resolution."</li>
	 * </ul>
	 */
	public static final VoteInstructionCode ThreeYears = new VoteInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			definition = "Vote in favour for three years for \"say on pay\" type of resolution.";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstructionCode.mmObject();
			codeName = "THRY";
		}
	};
	final static private LinkedHashMap<String, VoteInstructionCode> codesByName = new LinkedHashMap<>();

	protected VoteInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CFOR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionCode";
				definition = "Specifies the possible types of voting instructions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.VoteInstructionCode.For, com.tools20022.repository.codeset.VoteInstructionCode.Against, com.tools20022.repository.codeset.VoteInstructionCode.Abstain,
						com.tools20022.repository.codeset.VoteInstructionCode.Withhold, com.tools20022.repository.codeset.VoteInstructionCode.WithManagement, com.tools20022.repository.codeset.VoteInstructionCode.AgainstManagement,
						com.tools20022.repository.codeset.VoteInstructionCode.Discretionary, com.tools20022.repository.codeset.VoteInstructionCode.NoAction, com.tools20022.repository.codeset.VoteInstructionCode.Chairman,
						com.tools20022.repository.codeset.VoteInstructionCode.OneYear, com.tools20022.repository.codeset.VoteInstructionCode.TwoYears, com.tools20022.repository.codeset.VoteInstructionCode.ThreeYears);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(For.getCodeName().get(), For);
		codesByName.put(Against.getCodeName().get(), Against);
		codesByName.put(Abstain.getCodeName().get(), Abstain);
		codesByName.put(Withhold.getCodeName().get(), Withhold);
		codesByName.put(WithManagement.getCodeName().get(), WithManagement);
		codesByName.put(AgainstManagement.getCodeName().get(), AgainstManagement);
		codesByName.put(Discretionary.getCodeName().get(), Discretionary);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(Chairman.getCodeName().get(), Chairman);
		codesByName.put(OneYear.getCodeName().get(), OneYear);
		codesByName.put(TwoYears.getCodeName().get(), TwoYears);
		codesByName.put(ThreeYears.getCodeName().get(), ThreeYears);
	}

	public static VoteInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static VoteInstructionCode[] values() {
		VoteInstructionCode[] values = new VoteInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, VoteInstructionCode> {
		@Override
		public VoteInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(VoteInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}